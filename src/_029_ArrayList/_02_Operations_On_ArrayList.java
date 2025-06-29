package _029_ArrayList;
import java.util.ArrayList;
//Operations on ArrayList with their time complexity

public class _02_Operations_On_ArrayList {
    public static void main(String[] args) {
        //Add Element  -- O(1)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(1);
        System.out.println(list);  //Output: [3, 7, 5, 1]
//        list.add(1,9); // -- add 9 on index 1  -- O(n)  --> O(n)
//        System.out.println(list); //Output: [3, 9, 7, 5, 1]

        //Get Element -- O(1)
        int element = list.get(2);
        System.out.println(element); //Output: 5

        //Delete Element -- O(n)
        list.remove(2);
        System.out.println(list); //Output: [3, 7, 1]

        //Set Element -- O(n)
        list.set(2,10);
        System.out.println(list); //Output: [3, 7, 10]

        //Contains Element -- O(n)
        System.out.println(list.contains(7)); //Output: true
        System.out.println(list.contains(5)); //Output: false
    }
}
/*
Output:
[3, 7, 5, 1]
5
[3, 7, 1]
[3, 7, 10]
true
false
 */