package pattern2;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a even number for pattern");
        int number= sc.nextInt();
        if(number%2==0){
            MakePattern obj = new MakePattern();
            obj.pattern(number);
            
        }else{
            System.out.println("You enter a even number,  plz try again");
        }
        sc.close();
    }
}
