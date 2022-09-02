public class passVal {
    public static void main(String[] args) {
        System.out.println(lengthOfPass("test Pass"));
    }

    public static String lengthOfPass(String password) {

        if(password.length() >= 8){
            return "Password is valid!";
    } else {
            return "Pass is invalid";
    }
    }

    public static String passNumber (String number) {

    }

}

