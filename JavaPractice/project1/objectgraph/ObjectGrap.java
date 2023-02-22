package objectgraph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ObjectGraph{
    public static void main(String[] args) {
        Three t3 = new Three();
        Two t2 = new Two(t3);
        One t1 = new One(t2);
        
        System.out.println(t1.cube(2));
        System.out.println(t2.square(2));
        System.out.println(t3.getnum(2));

        One obj = new One(new Two(new Three()));
        System.out.println(obj.cube(3));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        String name;
        try {
            name = br.readLine();
            System.out.println("name : "+name);
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        
    }
}