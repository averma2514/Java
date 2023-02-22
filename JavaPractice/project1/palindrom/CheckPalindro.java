package palindrom;

public class CheckPalindro {
    int reverse;
    int temp=0;
    public int reverse(int number) {
        temp=number%10;
        reverse=(temp/10);
        temp=temp*reverse;


        return temp;
    }
}
