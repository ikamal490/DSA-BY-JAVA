package _029_ArrayList;
//Multi-Dimensional ArrayList
import java.util.ArrayList;

public class _08_Multi_Dimensional_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        mainList.add(list2);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println("Main List: "+mainList);
    }
}
/*
Output:
1 2
2 3
Main List: [[1, 2], [2, 3]]

 */