package frequency;


public class FindFrequency {
    
    void occurrence(int[] arr){

        int[] reappear =new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            reappear[i]=count;
        }
    }
}
