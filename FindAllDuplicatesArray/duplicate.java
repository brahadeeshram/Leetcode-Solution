package LeetCode.FindAllDuplicatesArray;

import java.util.ArrayList;
import java.util.List;

public class duplicate {
    public static void main(String[] args) {
        int a[]={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(a));
    }
    public static List<Integer> findDuplicates(int[] a) {
        
        List<Integer> li = new ArrayList<>();
        boolean b[] =new boolean[a.length+1];
        for (int c : a) {
            if (b[c]) {
                li.add(c);
            }
            b[c]=true;
        }
        return li;
    }
}
