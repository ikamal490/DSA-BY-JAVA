package _029_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
//Sort an ArrayList

public class _07_Sorting_An_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Original: "+list);
        //Ascending order
        Collections.sort(list);
        System.out.println("Ascending Sorted: "+list);

        //Descending Order
        Collections.sort(list, Collections.reverseOrder());
//        Collections.reverseOrder() -- it is a Comparator function which define the logic, ki kis trah se sorting honi chahiye
        System.out.println("Descending Sorted: "+list);
    }
}
/*
Output:
Original: [2, 5, 9, 3, 6]
Ascending Sorted: [2, 3, 5, 6, 9]
Descending Sorted: [9, 6, 5, 3, 2]
 */
