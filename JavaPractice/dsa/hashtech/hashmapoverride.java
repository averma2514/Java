package dsa.hashtech;
import java.util.*;

public class hashmapoverride {
   public static void main(String[] args) {
        Employee p1 =new Employee("aditya",1); 
        Employee p2 =new Employee("aditya",1); 

        Map<Employee,String>map = new HashMap<Employee,String>();
        map.put(p1,"CSE");
        map.put(p2,"IT");
        for(Employee geek: map.keySet()){
            System.out.println(map.get(geek).toString());
        }
   } 
}
class Employee{
    String name;
    int id;
    Employee(String name, int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null||obj.getClass()!=this.getClass())
            return false;
        Employee geek = (Employee) obj;
        return( geek.name.equals(this.name)&& geek.id==this.id);
    }   
}