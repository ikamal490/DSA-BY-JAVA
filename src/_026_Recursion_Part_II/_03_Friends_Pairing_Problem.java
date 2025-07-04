package _026_Recursion_Part_II;
// Friends Pairing Problem

public class _03_Friends_Pairing_Problem {
    public static int friendsPairing(int n){
        //Base condition
        if(n==1 || n==2){
            return n;
        }

        // choice

            // Single
            int fnm1 = friendsPairing(n-1);

            //Pair
            int fnm2 = friendsPairing(n-2);
            int pairWays = (n-1) * fnm2;

        //Total ways
        int totalWays = fnm1 + pairWays;
        return totalWays;

        // Direct Method
       // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void main(String args[]){
        System.out.println(friendsPairing(3));
        System.out.println(friendsPairing(4));
    }
}
/*
Output:
4
10
 */
