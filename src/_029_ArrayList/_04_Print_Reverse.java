package _029_ArrayList;
import java.util.ArrayList;
//Print ArrayList in Reverse Order
//Time Complexity - O(n)

public class _04_Print_Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(8);

        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}

/*
Output:
8 1 2 5 3
 */