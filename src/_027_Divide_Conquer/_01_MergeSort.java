package _027_Divide_Conquer;

public class _01_MergeSort {
    public static void printArr(int[] arr){
        for(int elements: arr){
            System.out.print(elements+" ");
        }
    }

    public static void mergeSort(int[] arr, int si, int ei){ //Using of Recursion
        //Base case
        if(si >= ei){
            return;
        }
        //kaam
        int mid = (si + ei)/ 2; //Find a mid - element of an array
        mergeSort(arr,si,mid); //Assume left part sort
        mergeSort(arr,mid+1,ei); //Assume right part sort

        merge(arr,si,mid,ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp var
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else {
                temp[k] = arr[j];
                j++;
                k++;
            }
//            k++;
        }

        //left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
/*
Output:
2 3 5 6 8 9
 */