import java.util.Scanner;

public class calculate_CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double english;
        double hindi;
        double maths;
        double science;
        double social_study;
        System.out.println("Enter marks out of 100");
        System.out.print("English = ");
        english=sc.nextDouble();
        System.out.print("Hindi = ");
        hindi=sc.nextDouble();
        System.out.print("Maths = ");
        maths=sc.nextDouble();
        System.out.print("Science = ");
        science=sc.nextDouble();
        System.out.print("Social Study = ");
        social_study=sc.nextDouble();

        if(english>100||hindi>100||maths>100||science>100||social_study>100){
            System.out.println("Entered invalid number");
        }else{
            Double total =english+hindi+maths+science+social_study;
            System.out.println("\nTotal marks of 5 subject = "+total);
            Double percentage =total/5;
            System.out.println("Percentage of 5 subject = "+percentage);
            Double cgpa = percentage/10;
            System.out.printf("CGPA = %.2f",cgpa);

        }

        sc.close();
    }
}
