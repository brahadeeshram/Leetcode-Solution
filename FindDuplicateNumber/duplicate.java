package LeetCode.FindDuplicateNumber;

public class duplicate {
    public static void main(String[] args) {
        int a[]={1,3,4,2,5};
        System.out.println(duplicate(a));
    }
    public static int duplicate(int a[]){
        boolean b[] =new boolean[a.length+1];
        for (Integer c : a) {
            if (b[c]) {
                return c;
            }
            b[c]=true;
        }
        return 69;
    }
}
