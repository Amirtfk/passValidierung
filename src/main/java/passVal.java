public class passVal {
    public static void main(String[] args) {
        System.out.println(lengthOfPass("test Pass"));
        String password = "123456789";
    }

    public static String lengthOfPass(String password) {

        if(password.length() >= 8){
            return "Password is valid!";
    } else {
            return "Pass is invalid";
    }
    }

    public static boolean passNumber (String password) {
        for (int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }

}

