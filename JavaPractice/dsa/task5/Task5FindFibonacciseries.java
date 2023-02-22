package dsa.task5;
import java.util.Scanner;
class FindFibonacci{

    int fibonacci(int number){
        if(number==0)
            return 0;
        
        if(number==1)
            return 1;
        
        return (fibonacci(number-1)+fibonacci(number-2));

    }
}


public class Task5FindFibonacciseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        FindFibonacci fib = new FindFibonacci();
        int number =scanner.nextInt();
        for (int i = 0; i < number; i++) {
           System.out.println( fib.fibonacci(i));
        }
        scanner.close();
    }
    
    
}
