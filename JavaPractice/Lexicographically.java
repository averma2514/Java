import java.util.Scanner;

public class Lexicographically {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String string1;
        String string2;
        System.out.print("Enter 1st string : ");
        string1 = scanner.nextLine();
        
        System.out.print("Enter 2nd string : ");
        string2 = scanner.nextLine();
        
        //step 1
        System.out.println("sum of 1st string and 2nd string : "+(string1+string2).length());

        //step 2 
        char[] st1 = string1.toCharArray();
        char[] st2 = string2.toCharArray();

        System.out.print("string 1 is lexicographically string 2 ? : ");
        if(st1[0]>st2[0]){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

        //step 3
        System.out.println("Final string : "+string1.substring(0, 1).toUpperCase() + string1.substring(1)+" "+string2.substring(0, 1).toUpperCase() + string2.substring(1));
        scanner.close();
    }
    
}