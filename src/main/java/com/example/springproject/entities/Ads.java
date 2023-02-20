package com.example.springproject.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Ads")
public class Ads extends Publication{
    private String adName;
    private String channel;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date startDate;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date endDate;
    private String type;
    private Float adPrice;


}
