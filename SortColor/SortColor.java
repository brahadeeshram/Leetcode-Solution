package LeetCode.SortColor;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int a[]={3,2,0,1,2,0,3};
        sortColors(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sortColors(int[] a) {
        sortNew(a,0,a.length-1);
    }
    public static void sortNew(int a[],int low, int hi){
        if(low>hi){
            return;
        }
        int s=low;
        int e=hi;
        int m=(s+e)/2;
        int pivot=a[m];
        while(s<=e){
            while(a[s]<pivot){
                s++;
            }
            while(a[e]>pivot){
                e--;
            }
            if(s<=e){
                int tem=a[s];
                a[s]=a[e];
                a[e]=tem;
                s++;
                e--;
            }
        }
        sortNew(a,low,e);
        sortNew(a,s,hi);
    }
}
