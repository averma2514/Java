package collectionAndStreams;


public class Student {

    private String name;
    private int age;
    private boolean gender;
    private float grade;
    
    public Student(String name, int age, boolean string, float grade) {
        this.name = name;
        this.age = age;
        this.gender = string;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean getGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public float getGrade() {
        return grade;
    }
    public void setGrade(float grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", grade=" + grade + "]";
    }
    
   
    
    
}
