package thread;

import java.util.concurrent.Semaphore;


class Semaphonedemo {
    static Semaphore semaphore = new Semaphore(4);

    static class ATMclass extends Thread{
        private String name;
    
        public ATMclass(String name) {
            this.name = name;
        }

        @Override
        public void run(){
        try{
                System.out.println(name +" : acquiring lock" );
                System.out.println(name +" : available semaphore permit now : "+semaphore.availablePermits());
                semaphore.acquire();
                System.out.println((name+ " : got the permit"));

                try{
                    for (int i = 0; i < 5; i++) {
                        System.out.println(name+" : is performing operation "+i+", available Semaphore permits : "+semaphore.availablePermits());
                        Thread.sleep(3000);
                    }
                }finally{
                    System.out.println(name+" : releasing lock...");
                    semaphore.release();
                    System.out.println(name+" : available semaphore permit now : "+semaphore.availablePermits());
                }

     }catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }


    public static void main(String[] args) {
        System.out.println("total available semaphore permit "+semaphore.availablePermits());
        ATMclass t1 = new ATMclass("A");
        t1.start();
        ATMclass t2 = new ATMclass("B");
        t2.start();
        ATMclass t3 = new ATMclass("C");
        t3.start();
        ATMclass t4 = new ATMclass("D");
        t4.start();
        ATMclass t5 = new ATMclass("E");
        t5.start();
        ATMclass t6 = new ATMclass("D");
        t6.start();
        
        
    }
}
    
}
