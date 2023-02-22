package factoryclass;

import java.util.Scanner;

public class GenrateBill {
    public static void main(String[] args) {
        GetPlanFactory gpf = new GetPlanFactory();
        System.out.println("Enter plan and units");
        Scanner scanner = new Scanner(System.in);

        String name =scanner.next();
        int units = scanner.nextInt();

        Plan p= gpf.getPlan(name);
        if (p==null) {
            System.out.println("Wrong plan..");
        }else{
            p.getRate();
            p.claculateBill(units);
        }
        
        scanner.close();
    }
}
