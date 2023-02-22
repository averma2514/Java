package dsa.task3;
import java.util.Scanner;


class Sort{
    int[] sortArray(int[] array1,int[] array2,int size1,int size2){
        int[] array3=new int[size1+size2];
       
        //sorting of array1
       
        for(int i=0;i<size1;i++){
            for(int j=i+1;j<size1;j++){
                if(array1[i]>array1[j]){
                    int temp=array1[i];
                    array1[i]=array1[j];
                    array1[j]=temp;
                }
            }
        }

        //sorting of array2

        for(int i=0;i<size2;i++){
            for(int j=i+1;j<size2;j++){
                if(array2[i]>array2[j]){
                    int temp=array2[i];
                    array2[i]=array2[j];
                    array2[j]=temp;
                }
            }
        }

        //now the merging of array1 and array2

        int ar1=0,ar2=0,a1,a2;
        a1=array1[ar1];
        a2=array2[ar2];
        for (int i = 0; i < array3.length; i++)
        {
            if(a1<a2){
                array3[i]=a1;     //array1={4,2,1}  array2={7,5,10}  size1=3,  size2=3

                if(ar1<size1-1){     //0<3
                    a1=array1[++ar1];   //a1=array1[1]
                }else{  
                    a1=Integer.MAX_VALUE; 
                }  
            }else{
                array3[i]=a2;
                if(ar2<size2-1){
                    a2=array2[++ar2];  //ar2[1]
                }else{
                    a2=Integer.MAX_VALUE;
                }  
            }
        }
        return array3;
    }

}

public class MergSort{
    public static void main(String[] args) {
        System.out.println("Enter size of first array");        //elements you want in 1st array
        Scanner scanner = new Scanner(System.in);
        
        int size1=scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter "+size1+" element  for first element");   //element in second array
        for(int i=0;i<size1;i++){                   
            array1[i]=scanner.nextInt();
        }
        
        System.out.println("Enter size of second element");
        int size2=scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter "+size2+" element  for second element");
        for(int i=0;i<size2;i++){
            array2[i]=scanner.nextInt();
        }
        
        Sort sort = new Sort();
        
        int[] array3= sort.sortArray(array1, array2, size1, size2);

        for (int i : array3) {
            System.out.print(i+" ");
        }
        scanner.close();
    }
}