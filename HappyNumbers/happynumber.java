package LeetCode.HappyNumbers;

public class happynumber {
    public static void main(String[] args) {
        System.out.println(happynumber(19));
    }
    public static boolean happynumber(int n){
        int fast=n;
        int slow=n;
        do{
            slow=sq(n);
            fast=sq(sq(n));
        }while(fast!=slow);
        if (slow==1) {
            return true;
        }
        return false;
    }
    public static int sq(int n){
        int ans=0;
        while (n>0) {
            int rem=n%10;
            ans=ans+rem*rem;
            n=n/10;
        }
        return ans;
    }
}
