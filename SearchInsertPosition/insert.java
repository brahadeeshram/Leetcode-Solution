package LeetCode.SearchInsertPosition;

public class insert {
    public static void main(String[] args) {
        int a[]={1,3,5,6};
        System.out.println(insert(a, 2));
    }
    public static int insert(int a[], int t){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==t) {
                return i;
            }
            if (a[i]>t) {
                return i;
            }
        }
        return a.length;
    }
}
