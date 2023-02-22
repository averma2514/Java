package pattern;

public class MakePattern {
    int number;

    public MakePattern(int x){
        number=x;
    }

    public void pattern(){
        for(int i=1;i<=number;i++){
            for (int j = 0; j < i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=number;i++){
            for (int j = i; j < number; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
