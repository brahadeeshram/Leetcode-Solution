package LeetCode.FindNumbersEvenNumberofDigits;

import java.util.Arrays;

public class number {
    public static void main(String[] args) {
        int a[]={12,345,2,6,7896};
        System.out.println(number(a));
    }
    public static int number(int[] a){
        int count=0;
        for (int i : a) {
            if ((int)Math.log10(i)%2!=0) {
                count++;
            }
        }
        return count;
    }
}
