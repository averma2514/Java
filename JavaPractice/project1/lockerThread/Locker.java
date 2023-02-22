package lockerThread;

import java.util.concurrent.Semaphore;


class Locker {
    static Semaphore semaphore = new Semaphore(1);

    static class Lockerclass extends Thread{
        private String name;
    
        public Lockerclass(String name) {
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
                    for (int i = 0; i < 1; i++) {
                        System.out.println(name+" : is performing operation "+i+", available Semaphore permits : "+semaphore.availablePermits());
                        Thread.sleep(1000);
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
        Lockerclass t1 = new Lockerclass("A");
        t1.start();
        Lockerclass t2 = new Lockerclass("B");
        t2.start();
        Lockerclass t3 = new Lockerclass("C");
        t3.start();
        Lockerclass t4 = new Lockerclass("D");
        t4.start();
        Lockerclass t5 = new Lockerclass("E");
        t5.start();
        Lockerclass t6 = new Lockerclass("D");
        t6.start();
        
        
    }
}
    
}
