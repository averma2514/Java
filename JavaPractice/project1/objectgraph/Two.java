package objectgraph;

public class Two {
    int o2; 
    Three t3;

    Two(Three x){
        o2=200;
        t3=x;
    }
    double square(double x) {
        return x*t3.getnum(x);
    }

    public void show() {
        System.out.println(o2);
        t3.show(); //calling Three function
    }
}
