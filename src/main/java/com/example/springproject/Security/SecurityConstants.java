package com.example.springproject.Security;

public class SecurityConstants {

    public static final long EXPIRATION_TIME = 864000000; // 10 days
    // Signing key for HS512 algorithm
    // You can use the page http://www.allkeysgenerator.com/ to generate all kinds of keys
    public static final String AUTHORIZATION_SECRET = "n2r5u8x/A%D*G-KaPdSgVkYp3s6v9y$B&E(H+MbQeThWmZq4t7w!z%C*F-J@NcRf";

    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADERS_STRING = "Authorization";
    public static final String LOG_IN_URL = "/users/login";
    public static final String SIGN_UP_URL = "/api/users";
    public static final String VERIFY_EMAIL_URL = "/email-verification";

    public static final String LOGIN_URL = "/login";


    //JWT token defaults
    public static final String AUTHORIZATION = "Authorization";
    public static final String PASSWORD_CHANGE = "password-change";
    public static final String BEARER_ = "Bearer ";
    public static final String BASIC_ = "Basic ";
    public static final String TOKEN_TYPE = "JWT";
    public static final String TOKEN_ISSUER = "secure-api";
    public static final String TOKEN_AUDIENCE = "secure-app";


    private SecurityConstants() {
    }
}
