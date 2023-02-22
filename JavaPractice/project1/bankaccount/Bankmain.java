package bankaccount;

import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double ba) {
        System.out.println("ctor...");
        balance = ba;
    }

    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

    public void authenticate() {
        System.out.println("enter password: ");
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.next();
        if (pass.equals("ram")) {
            Interest i = new Interest(5.4);
            i.calcInterest();
        } else
            System.out.println("not authorized");

        scanner.close();
    }

    private class Interest {
        double rate;

        public Interest(double d) {
            rate = d;
        }

        public void calcInterest() {
            double inter = balance * rate / 100;
            balance += inter;
        }
    }
}

public class Bankmain {
    public static void main(String[] args) {
        BankAccount o = new BankAccount(1000);
        System.out.println(o.getBalance());
        o.authenticate();
        System.out.println(o.getBalance());
    }
}