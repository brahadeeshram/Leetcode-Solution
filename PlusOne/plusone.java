package LeetCode.PlusOne;

import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        int a[]={9,9,9,9};
        System.out.println(Arrays.toString(plusone(a)));
    }
    public static int[] plusone(int a[]){
        for (int i = a.length-1; i >= 0; i--) {
            if (a[i]<9) {
                a[i]++;
                return a;
            }
            a[i]=0;
        }
        int arr[] = new int[a.length+1];
        arr[0]=1;
        return arr;
    }
}
