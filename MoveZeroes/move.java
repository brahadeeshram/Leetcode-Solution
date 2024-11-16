package LeetCode.MoveZeroes;

import java.util.Arrays;

public class move {
    public static void main(String[] args) {
        int a[]={0,1,0,3,12};
        move(a);
        System.out.println(Arrays.toString(a));
    }
    public static void move(int a[]){
        int i=0;
        int j=0;
        while (i<a.length) {
            if (a[i]!=0) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
            i++;
        }
    }
}
