package pattern;

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number for pattern : ");
        MakePattern obj = new MakePattern(sc.nextInt());
        obj.pattern();
        
        sc.close();
    }
}
