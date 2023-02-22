package vowels;
import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    RemoveVowels obj = new RemoveVowels();

    System.out.print("Enter a String to remove vowels : ");
    obj.removevowels(sc.next());
    
    sc.close();
}
}
