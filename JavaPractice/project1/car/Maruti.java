package car;

public class Maruti extends Car {
    Engine MarutiEngine = null;

    public void marutiStartDemo() {
        MarutiEngine = new Engine();
        MarutiEngine.start();
        System.out.println("Working..");
        MarutiEngine.stop();
    }
}


class Engine {

    public void start(){
        System.out.println("Engine Started");
    } 
    public void stop() {
        System.out.println("Engine stopped");
    }
}
