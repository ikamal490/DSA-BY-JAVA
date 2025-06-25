package Questions_Practice;
//If reverse num greater than original number return reverse, otherwise -1
// reverseIfGreaterThanOriginal

public class _033_reverseIfGreaterThanOriginal {
    public static int checkRevIfGreater(int n) {
        int originalNum = n;
        int rev = 0;
        while(n>0) {
            int lastDigit = n%10;
            rev = rev * 10 + lastDigit;
            n = n/10;
    }
        if(rev > originalNum) {
            return rev;
        }
        return -1;
}

    public static void main(String[] args) {
        int n = 12;
        int n1 = 21;
        System.out.println(checkRevIfGreater(n));
        System.out.println(checkRevIfGreater(n1));
    }
}

/*
Output:
Input: 12
output: 21
Explanation: If we rev the 12, that's 21 which is greater than 12.We return it

Input: 21
output: -1
Explanation: If we reversed the 21, that's 12  which is smaller than original num, so we return -1
 */
