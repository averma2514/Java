package password;

class  Check {
    Boolean checkpassword(String password){

        char[] pass = password.toCharArray();
        
        if(password.length()<=6 || password.length()>=10){
            return false;
        }

        for(char p : pass){
            if(p>='0' && p<='9'){
                return true;
            }
        }

        for(char p : pass){
            if(p>='a' && p<='z'){
                return true;
            }
        }

        for(char p : pass){
            if(p>='A' && p<='Z'){
                return true;
            }
        }

        
        return false;
    }
}
