package LeetCode.SortArrayByParity;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int a[]={3,1,2,4};
        System.out.println(Arrays.toString(array(a)));
    }
    public static int[] array(int a[]){
        int i=0;
        int j=0;
        while (i<a.length) {
            if (a[i]%2==0) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
            i++;
        }
        return a;
    }
}
