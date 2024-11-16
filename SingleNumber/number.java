package LeetCode.SingleNumber;

public class number {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6,2,5,3,1};
        System.out.println(number(a));
    }
    public static int number(int a[]){
        int sum=a[0];
        for (int i = 1; i < a.length; i++) {
            sum=sum^a[i];
        }
        return sum;
    }
}
