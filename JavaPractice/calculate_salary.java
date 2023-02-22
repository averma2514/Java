import java.util.Scanner;


public class calculate_salary {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary : ");
        int salary = sc.nextInt();

        System.out.println("HRA of employee is : "+((salary*10)/100));
        System.out.println("DA of employee is : "+((salary*20)/100));
        System.out.println("Gross salary of employee is : "+(((salary*10)/100)+((salary*20)/100)+salary));

        sc.close();
    }
}