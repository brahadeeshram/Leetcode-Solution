package LeetCode.ContainsDuplicate;

import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,1};
        System.out.println(duplicate(a));
    }    
    public static boolean duplicate(int a[]){
        HashSet<Integer> h= new HashSet<>();
        h.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (h.contains(a[i])) {
                return true;
            }
            h.add(a[i]);
        }
        return false;
    }
}
