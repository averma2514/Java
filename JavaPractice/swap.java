import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number for swapping : ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;

        System.out.println("After swapping \nnumber1 = "+number1+"\nnumber2 = "+number2);
        sc.close();
    }
}
