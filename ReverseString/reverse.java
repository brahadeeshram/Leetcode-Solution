package LeetCode.ReverseString;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        char a[]={'h','e','l','l','o'};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(char s[]){
        for (int i = 0,j=s.length-1; i < s.length/2||j>s.length/2; i++,j--) {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}
