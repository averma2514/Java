package task;
import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        Car objCar = new Car();

        System.out.println("Enter Brand of car");
        objCar.setBrandName(sc.next());

        System.out.println("Enter Reg no. ");
        objCar.setRegNo(sc.nextInt());
        
        Passenger pass = new Passenger();

        System.out.println("Enter name of Passenger");
        pass.setPassenger(sc.next());

        objCar.carryPassenger(pass);
        
        sc.close();
    }
}