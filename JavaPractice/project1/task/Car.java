package task;

public class Car {
    private String brandName;
    private int regNo;


    //get
    public String getBrandName() {
        return brandName;
    }
    public int getRegNo() {
        return regNo;
    }


    //set
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }


    void carryPassenger(Object pass){
        System.out.println("Brand of car : "+getBrandName());
        System.out.println("Reg no. of car : "+getRegNo());
        System.out.println("Passenger name : "+((Passenger) pass).getPassenger());
    }   
}
