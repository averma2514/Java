package dsa.mergsort;

class MergSort{

    public void sort(int[] arr,int beg,int end){
        if(beg<end){
            int mid = (beg+end)/2;
            sort(arr,beg,mid);
            sort(arr,mid+1,end);
            merg(arr,beg,mid,end);
        }

    }

    void merg(int[] arr,int beg,int mid,int end){
        int size1= mid-beg+1;
        int size2 = end-mid;
        int i,j,k;

        int array1[] =new int[size1];
        int array2[] = new int[size2];

        for(i=0;i<size1;i++){
            array1[i] = arr[i+beg];
        }
        for(j=0;j<size2;j++){
            array2[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=beg;
        
        while(i<size1 &&j<size2){
            if(array1[i]>array2[j]){
                arr[k]=array2[j++];

            }else{
                arr[k]=array1[i++];
            }
            k++;
        }
        while(i<size1){
            arr[k++]=array1[i++]; //we increment here insted of increment in next line.
        }

        while(j<size2){
            arr[k++] = array2[j++]; 
        }

    }


public static void main(String[] args) {
        int[] array = {1,5,8,2,7,9};
        MergSort mg = new MergSort();
        mg.sort(array,0,5);

        for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
        }

    }
}



// uncomplete code....
