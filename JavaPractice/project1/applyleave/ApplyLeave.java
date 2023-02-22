package applyleave;

import java.util.ArrayList;

class Empl{
    private int id;
    private String name;
    private int leave;


    public Empl(int id,String name){
        super();
        this.id=id;
        this.name=name;
        leave=2;
    }

    public int geteID(){
        return id;
    }


    public void takeleave(int x){

        if(leave>=x)
            leave -=x;
        else
            System.out.println("error");
    }
    
    public String toString(){
        return "Emp [id="+id+" , leave = "+leave+" , name = "+name+"]";
    }
}


class Collection{

    private String orgName;
    private int strength;

    ArrayList<Empl> alist = new ArrayList<>();

    public Collection(String string){
        strength=0;
        orgName=string;
    }

    public String getorName(){
        return orgName;
    }
    public void setorName(String orName){
        this.orgName=orName;
    }

    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength=strength;
    }

    public void addEmpl(Empl x){
        alist.add(x);
        System.out.println("added amp..");
        strength+=1;
    }


    public void showEmpl(){
        for(Empl x : alist){
            System.out.println(x);
        }
    }

    public void applyleave(int id,int no){
        for(Empl x: alist){
            if (x.geteID()==id) {
                x.takeleave(no);
            }
        }
    }

}


public class ApplyLeave {

    public static void main(String[] args) {
      
        Collection col = new Collection("Chitkara");
        

        col.addEmpl(new Empl(1, "Aman"));
        col.addEmpl(new Empl(2, "Anmol"));


        col.applyleave(1, 1);

        col.showEmpl();

        col.applyleave(1, 2);

        
    }
}