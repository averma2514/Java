
import java.util.Scanner;

public class FindFrequency {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n =sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter 3 number");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to find frequency : ");
        int find =sc.nextInt();

        int count=0;
        
        for(int j=0;j<n;j++){
            if(find==arr[j]){
                count++;
            }
        }
        System.out.println("Frequency of "+find+" is : "+count);
        
        sc.close();
        
    }
}
