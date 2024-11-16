package LeetCode.FindAllNumberDisappearedArray;

import java.util.ArrayList;
import java.util.List;

public class duplicate {
    public static void main(String[] args) {
        int a[]={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(a));
    }
    public static List<Integer> findDisappearedNumbers(int[] a) {
        boolean b[]= new boolean[a.length+1];
        for (int c : a) {
            b[c]=true;
        }
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < b.length; i++) {
            if (!b[i]) {
                li.add(i);
            }
        }
        return li;
    }
}
