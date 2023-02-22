package square;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  5 numbers");

        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i]= scanner.nextInt();
        }

        CalculateSquare obj = new CalculateSquare();
        int[]  sqar=obj.calculate(number);

        for (int i = 0; i < sqar.length; i++) {
            System.out.println(sqar[i]);
        }

        scanner.close();
    }
}
