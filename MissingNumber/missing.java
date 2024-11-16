package LeetCode.MissingNumber;

public class missing {
    public static void main(String[] args) {
        int a[]={3,0,1};
        System.out.println(missing(a));
    }
    public static int missing(int a[]){
        int n=a.length;
        int ans=n*(n+1)/2;
        for (int i = 0; i < a.length; i++) {
            ans=ans-a[i];
        }
        return ans;
    }
}
