package _029_ArrayList;
import java.util.ArrayList;
//Swap of 2 Numbers

public class _06_Swap2Numbers {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){ //same as swap(int[] arr, int idx1, int idx2)
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1, idx2 = 3;
        System.out.println("Original ArrayList: "+list);
        swap(list, idx1, idx2);
        System.out.println("After Swap: "+list);
    }
}
/*
Output:
Original ArrayList: [2, 5, 9, 3, 6]
After Swap: [2, 3, 9, 5, 6]
 */