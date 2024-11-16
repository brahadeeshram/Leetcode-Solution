package LeetCode.Palindrome;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-3553));
    }
    public static boolean isPalindrome(int x) {
        int check=x;
        int sum=0;

        while(x>0){
            int rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        if(check==sum){
            return true;
        }
        else{
            return false;
        }
    }
}
