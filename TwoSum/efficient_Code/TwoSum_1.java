package LeetCode.TwoSum.efficient_Code;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum_1 {
    public static void main(String[] args) {
        int a[]={2,8,7,5,6};
        System.out.println(Arrays.toString(twosum(a, 9)));
    }
    public static int[] twosum(int[] a, int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int com=target-a[i];
            if (map.containsKey(com)) {
                return new int[] {i,map.get(com)};
            }
            map.put(a[i],i);
        }
        return new int[] {};
    }
}
