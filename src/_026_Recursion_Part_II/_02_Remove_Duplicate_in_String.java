package _026_Recursion_Part_II;

// Remove Duplicate in String
public class _02_Remove_Duplicate_in_String {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean[] map){ // StringBuilder usages here, bcz it is faster as compare to string
        // base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicate(str,idx+1,newStr,map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicate(str,idx+1,newStr.append(currChar),map); // append means it add currChar element in the last
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
}
/*
Output:
apncoleg
 */