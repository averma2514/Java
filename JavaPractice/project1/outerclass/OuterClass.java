package outerclass;

class Outer{

    Outer(){}
    static int outerstatic=10;
    private static int outerprivate =30;
    
    public static void show(){
        System.out.println(outerstatic);
        System.out.println(outerprivate);
    }

    public static class StaticNestedClass{
         void display(){
            System.out.println("outer static"+ outerstatic);
            System.out.println("outer_private"+outerprivate);

            show();
        }
    } 
}

public class OuterClass {
    public static void main(String[] args) {
        
        Outer.StaticNestedClass innerobj = new Outer.StaticNestedClass();

        innerobj.display();

    }

    
}
