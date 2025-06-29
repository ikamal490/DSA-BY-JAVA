package _029_ArrayList;
import java.util.ArrayList;
//Size of ArrayList and Print the ArrayList

public class _03_SizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(8);

        System.out.println(list.size()); //Output: 5

        //Print the ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(); //Output: 3 5 2 1 8
    }
}

/*
Output:
5
3 5 2 1 8
 */