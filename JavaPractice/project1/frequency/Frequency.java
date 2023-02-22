package frequency;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int number = sc.nextInt();
        int[] arr = new int[number];

        for (int i = 0; i < args.length; i++) {
            arr[i] = sc.nextInt();
        }

        FindFrequency obj = new FindFrequency();
        obj.occurrence(arr);
        
        sc.close();
    }
}
