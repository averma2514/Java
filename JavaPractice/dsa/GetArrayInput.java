package dsa;

import java.util.Scanner;

public class GetArrayInput {
    static int[] getArray(int size){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        scanner.close();
        return array;
    }
}
