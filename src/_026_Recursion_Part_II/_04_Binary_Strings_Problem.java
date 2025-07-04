package _026_Recursion_Part_II;

// Binary Strings Problem
public class _04_Binary_Strings_Problem {
    public static void printBinString(int n, int lastPlace, String str){
        //Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //kaam
        printBinString(n-1,0,str+"0"); // 0 ko toh har baar baithana hi hai
        if(lastPlace == 0){
            printBinString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        printBinString(3,0,"");
    }
}
/*
Output:
000
001
010
100
101
 */