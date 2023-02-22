package implement;

/**
 * B
 */
abstract class B {
    void a(){System.out.println("a method in class B");}
    void b(){}
    void d(){}
    
}

/**
 * M 
 */
class M extends B{
    
@Override
public void a(){
    super.a();
}

@Override
public void b() {
    System.out.println("b method");
}
}



/**
 * Implement
 */
public class Implement {

    public static void main(String[] args) {
        M obj = new M();
        obj.a();
        
        
    }
}