package LeetCode.mountain;

public class mountain {
    public static void main(String[] args) {
        int a[]={0,5,10,2};
        System.out.println(peakIndexInMountainArray(a));
    }
    public static int peakIndexInMountainArray(int[] a) {
        int s=0;
        int e=a.length-1;
        int m;
        while (s<=e) {
            m=s+(e-s)/2;                 
            if (a[m]<a[m+1]) {
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return s;
    }
}
