package LeetCode.FindSmallestLetterGreaterThanTarget;

public class small {
    public static void main(String[] args) {
        char a[]={'c','f','j'};
        System.out.println(nextGreatestLetter(a,'c'));
    }
    public static char nextGreatestLetter(char[] a, char target) { // "c","f","j"
        int s=0;
        int e= a.length-1;
        while (s<=e) {
            int m=(s+e)/2;
            if (a[m]>target) {  // if target and mid are equal, 's' will move as it use in return.
                e=m-1;
            }else{
                s=m+1;   // we use 's' in return statement so better use 's' in else statement.
            }
        }
        return a[s%a.length];
    }
}
