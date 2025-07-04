package _027_Divide_Conquer;

public class _02_QuickSort {
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        //last element
        int pIdx = partition(arr,si,ei); //(pivot index)
        quickSort(arr,si,pIdx-1); //left
        quickSort(arr,pIdx+1,ei); //right
    }

    public static int partition(int[] arr, int si,int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for elements smaller than pivot (-1)

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){ //kya mera current element pivot element se chota hai agar hai toh
                i++; //i++ jagah banayega array ke andar
                //swap
                int temp = arr[j];
                 arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr ={6,3,9,8,2,-5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
/*
Output:
-5 2 3 6 8 9
 */