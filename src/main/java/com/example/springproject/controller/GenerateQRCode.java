package com.example.springproject.controller;


import com.example.springproject.ServicesImpl.PDFGeneratorService;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

@RestController
public class GenerateQRCode {

    @GetMapping("/admin/qrcode")
    @ResponseBody
    public void generateQRCode(String link, HttpServletResponse response) throws IOException {
        link="https://www.linkedin.com/in/mahdi-fersi-349577215/";
        ByteArrayOutputStream out = QRCode.from(link).to(ImageType.PNG).stream();
        response.setContentType("image/png");
        response.setContentLength(out.size());
        response.setHeader("Content-Disposition", "attachment; filename=\"qrcode.png\"");
        response.getOutputStream().write(out.toByteArray());
        response.flushBuffer();
    }
    }

