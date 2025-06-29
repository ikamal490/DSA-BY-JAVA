package _029_ArrayList;
import java.util.ArrayList;
//Pair Sum - 2 pair in a Sorted & Rotated ArrayList
//Time complexity = O(n)
/*
QS
Find if any pair in a Sorted & Rotated ArrayList has a target sum.
list = [11, 15, 6, 8, 9, 10], target=16
 */

public class _14_PairSum_2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;  //breaking point
        int n = list.size();
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int lp = bp+1; //smallest
        int rp = bp; //largest

        while(lp != rp) {
            //case1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            //case2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % n;
            }else {
                //case3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10 - sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list,target));
    }
}
/*
Output:
true
 */