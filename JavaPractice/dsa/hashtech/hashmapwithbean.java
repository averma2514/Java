package dsa.hashtechng;
import java.util.*;


public class hashmapwithbean {
   public static void main(String[] args) {
        Person u1 =new Person("aditya",1); 
        Person u2 =new Person("aditya",1); 

        Map<Person,String>map = new HashMap<Person,String>();
        map.put(u1,"CSE");
        map.put(u2,"IT");
        for(Person geek: map.keySet()){
            System.out.println(map.get(geek).toString());
        }
   } 
}

class Person{
    String name;
    int id;
    Person(String name, int id){
        this.name=name;
        this.id=id;
    }
    
    public int hashCode(){
        return this.id;
    } 
}