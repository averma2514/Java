package anagram;
import java.util.Scanner;
class Anagram {
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two string");
   
    CheckAnagram obj = new CheckAnagram();

    if (obj.check(scanner.next() , scanner.next())) {
        System.out.println("True, the given string is anagram");
    }else{
        System.out.println("The give string is not anagram ");
    }

    scanner.close();
}    
}
