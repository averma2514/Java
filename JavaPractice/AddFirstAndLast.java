
import java.util.Scanner;

public class AddFirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 3 number");
        for(int i=0;i<3;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.print("Result : ");
        System.out.print(arr[0]+arr[2]);
        scanner.close();
    }
}
