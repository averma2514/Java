package dsa.task2;
import java.util.Scanner;

class SortNormal{
    int[] sortArray(int[] array1,int[] array2,int size1,int size2){
        int[] array3=new int[size1+size2];

        for (int i = 0; i < size1; i++) { //copy elements from array1 to array3
            array3[i]=array1[i];
        }

        for (int i = 0; i < size2; i++) {//copy elements from array2 to array3
            array3[size1+i]=array2[i];
        }

        //sorting array3
        for(int i=0;i<size1+size2;i++){
            for(int j=i+1;j<size1+size2;j++){
                if(array3[i]>array3[j]){
                    int temp=array3[i];
                    array3[i]=array3[j];
                    array3[j]=temp;
                }
            }
        }

        
        return array3;
    }

}

class MergSortNormal{
    public static void main(String[] args) {
        System.out.println("Enter size of first array");
        Scanner scanner = new Scanner(System.in);
        
        int size1=scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter "+size1+" element  for first element");
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
        
        SortNormal sort = new SortNormal();
        
        int[] array3=sort.sortArray(array1, array2, size1, size2);
        
        for (int number : array3) { //iterating array3 
            System.out.print(number+" ");
        }

        scanner.close();
    }
}