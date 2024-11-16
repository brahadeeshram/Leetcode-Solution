package LeetCode.Fibonnaci;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fi(9));
    }
    public static int fi(int n){
        if(n==1||n==2){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int n1=1,n2=1;
        for(int i=1;i<n;i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return n1;
    }
}
