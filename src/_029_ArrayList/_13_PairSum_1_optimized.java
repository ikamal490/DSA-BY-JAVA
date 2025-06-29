package _029_ArrayList;
import java.util.ArrayList;
//Pair Sum - 1 (2 Pointer Approach)
//Time Complexity = O(n)
/*
Find if any pair in a Sorted ArrayList has a target sum.
list = [1,2,3,4,5,6], target = 5
 */

public class _13_PairSum_1_optimized {
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp != rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            //case 2
            if(list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list,target));
    }
}
