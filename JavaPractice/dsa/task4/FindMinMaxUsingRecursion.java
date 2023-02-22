package dsa.task4;
import java.util.Scanner;

class MinMax{
    int findmin(int[] array,int start){
        if(start<array.length-1){
            return Math.min(array[start], findmin(array, start+1)); //math.min require two arguments one get by arr[start] and for second it call it self
        }
        return array[start];  //it assume last element is min and pass it 
    }

    int findmax(int[] array,int start){
        if(start<array.length-1){
            return Math.max(array[start], findmax(array, start+1)); //math.max require two arguments one get by arr[start] and for second it call it self
        }
        return array[start];//it assume last element is max and pass it
    }
}


public class FindMinMaxUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter "+size+" element for array");
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }


        MinMax minMax = new MinMax();
        
        System.out.println("min number "+minMax.findmin(array,0)); //finding min element in array by recursion 
        
        System.out.println("max number "+minMax.findmax(array,0)); //finding max element in array by recursion 

        scanner.close();
    }
    
    
}
