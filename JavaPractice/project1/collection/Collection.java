package collection;

import java.util.ArrayList;

class Empl{
    private int eID;
    private String eName;

    Empl(int eID,String eName){
        super();
        this.eID=eID;
        this.eName=eName;
    }

    public int geteID(){
        return eID;
    }

    public String geteName(){
        return eName;
    }

    public String toString(){
        return "Emp [id="+eID+" , name = "+eName+"]";
    }
}

public class Collection{

    private String orName;
    private int strength;

    ArrayList<Empl> alist = new ArrayList<>();

    public Collection(String string){
        strength=0;
        orName=string;
    }

    public String getorName(){
        return orName;
    }
    public void setorName(String orName){
        this.orName=orName;
    }

    public int getStrength(){
        return strength;
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

    public static void main(String[] args) {
        Collection o =new Collection("Chitkara");
        System.out.println(o.getorName());

        o.addEmpl(new Empl(1,"Aman"));
        o.addEmpl(new Empl(2,"sham"));
        o.addEmpl(new Empl(3,"kam"));
        o.showEmpl();

        System.out.println(o.getStrength());
    }

}

