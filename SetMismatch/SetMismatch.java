package LeetCode.SetMismatch;

import java.util.*;
public class SetMismatch {
    public static void main(String[] args) {
        
    }
    public static int[] SetMismatch(int a[]){
        boolean b[] = new boolean[a.length+1]; // 1,2,2,4
        for (int c : a) {
            b[c]=true;
        }
        
        for (int i = 1; i < b.length; i++) {
            if (!b[i]) {
                return new int[] {a[i-1],i};
            }
        }
        
        return new int[] {-1,-1};
    }
}
