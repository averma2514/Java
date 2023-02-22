package custom_sorting;

import java.util.Collections;
import java.util.LinkedList;

class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }

    
    
}



public class CustomSorting {
    public static void main(String[] args) {
     
        
        LinkedList<Student> obj = new LinkedList<>();

        obj.add(new Student(1, "Aman"));
        obj.add(new Student(5, "Anmol"));
        obj.add(new Student(3, "Avinash"));
        
        System.out.println(obj);
        Collections.sort(obj);

        System.out.println(obj);
    }
}
