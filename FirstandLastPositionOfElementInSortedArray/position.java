package LeetCode.FirstandLastPositionOfElementInSortedArray;

import java.util.Arrays;

public class position {
    public static void main(String[] args) {
        int a[] ={5,7,7,8,8,10};
        System.out.println(Arrays.toString(position(a, 8)));
    }
    public static int[] position(int a[],int t){
        int s=search(a,t,true);
        int e=search(a,t,false);
        return new int[] {s,e};
    }
    public static int search(int a[],int t, boolean isFirst){
        int s=0;
        int e=a.length-1;
        int ans=-1;
        while (s<=e) {
            int m=(s+e)/2;
            if (a[m]<t) {
                s=m+1;
            }else if(a[m]>t){
                e=m-1;
            }else{
                ans = m;
                if (isFirst) {
                    e=m-1;  
                }else{
                    s=m+1;
                }
            }
        }
        return ans;
    }
}
