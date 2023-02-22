package square;

public class CalculateSquare {
    
    public int[] calculate(int[] ar) {
        int[] squarear = new  int[5];
        
        int sq;
        for (int i = 0; i < ar.length; i++) {
            sq =0;
            for (int j = 0; j < ar.length; j++) {
               if (i!=j) {
                sq = sq+(ar[j]*ar[j]);
               }
            }    
            squarear[i] = sq;
        }
        return squarear;
    }
}
