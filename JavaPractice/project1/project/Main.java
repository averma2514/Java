package project;

import java.util.Scanner;
class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();

        Calculator obj = new Calculator();

        System.out.println("Add of two no. "+obj.add(a, b));
        System.out.println("sub of two no. "+obj.sub(a, b));
        System.out.println("mul of two no. "+obj.mul(a, b));
        System.out.println("div of two no. "+obj.div(a, b));
        System.out.println("mod of two no. "+obj.mod(a, b));

        sc.close();
    }
}
