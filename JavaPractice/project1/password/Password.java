package password;

import java.util.Scanner;

class Password {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password for verification");
        String password; 
        password= sc.nextLine();

        Check obj = new Check();
        if(obj.checkpassword(password)){
            System.out.println("Right password");
        }else{
            System.out.println("Wrong password");
        }

        sc.close();
    }
}
