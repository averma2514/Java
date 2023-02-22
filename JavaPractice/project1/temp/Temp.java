package temp;
import temp.Demo.Innerclass;


class Demo {

    private Demo() {
        
    }
    static int number=10;
    static void show(){
        System.out.println(number);
    }

    
        static class Innerclass {
        static int innerint =20;
        static void innershow(){
            System.out.println(innerint);
        }
        int a=10;
        int b=20;
        void add(){
            System.out.println(a+b);
        }   
    }
}


public class Temp {
    public static void main(String[] args) {
        Demo.show();

        Demo.Innerclass innerobj = new Demo.Innerclass();
        innerobj.add();

        Innerclass.innershow();
        
    }
}
