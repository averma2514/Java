package palindrom;

import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to palindrome or not : ");
        int number = scanner.nextInt();
       
        CheckPalindro obj = new CheckPalindro();
        System.out.println(obj.reverse(number));
     
        
        scanner.close();
    }
}
