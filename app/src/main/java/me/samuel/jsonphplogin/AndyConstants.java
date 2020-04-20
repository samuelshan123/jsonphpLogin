package me.samuel.jsonphplogin;

public class AndyConstants {
    // web service url constants
    public class ServiceType {
        public static final String BASE_URL = "https://myfirstprojectsamuel.000webhostapp.com/loginregdata/";
        public static final String LOGIN = BASE_URL + "postlogin.php";
        public static final String REGISTER =  BASE_URL + "postregister.php";

    }
    // webservice key constants
    public class Params {

        public static final String NAME = "name";
        public static final String EMAIL = "email";
        public static final String PASSWORD = "password";
    }
}