package car;

public class Car {
    private String color;
    private int maxSpeed;

    public void carinfo() {
        System.out.println("car color = "+color +"max speed "+maxSpeed);
    }

    public void setcolor(String color) {
        this.color=color;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed=maxSpeed;
    }
}
