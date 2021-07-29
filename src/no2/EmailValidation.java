package no2;

import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {

        String email1 = "handokoo@gmailcom";
        String email2 = "ardihandoyo@gmail.com";

        System.out.println("Email1 = "+ email1 + validasiEmail(email1));
        System.out.println("Email2 = "+email2 + validasiEmail(email2));

    }
    public static String validasiEmail(String email){
        if(email == null || email.isEmpty()){
            return " INVALID Email";
        }

        String  emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@"+
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(email).matches()){
            return " VALID Email";
        } else {
            return " INVALID Email";
        }

    }
}
