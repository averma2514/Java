package interfacemethod;


interface JDBC {
public void connect();
public void disconnect();
    
}


public class Oracle implements JDBC{
    public void connect() {
        System.out.println("connect to oracle");
    }

    public void disconnect() {
        System.out.println("disconnect to oracle");
    }
}

class Mysql implements JDBC{
    public void connect(){
        System.out.println("connect to Mysql");
    }

    public void disconnect() {
        System.out.println("disconnect to Mysql");
    }
}

class DemoInterface{
    public static void main(String[] args) {
        JDBC obj = new Oracle();
        obj.connect();
        obj.disconnect();

        Mysql obj1 =new Mysql();
        obj1.connect();
        obj1.disconnect();
    }
}