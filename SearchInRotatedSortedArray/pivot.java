package LeetCode.SearchInRotatedSortedArray;

public class pivot {
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2,3};
        System.out.println(search(a, 0));
    }
    public static int search(int a[], int target){
        int s=0;
        int e=a.length-1;
        int pivotIndex=pivot(a);
        if (pivotIndex==-1) {
            return bi(a, target, s, e);
        }
        if (target==a[pivotIndex]) {
            return pivotIndex;
        }
        if (target>a[0]) {
            return bi(a, target, s, pivotIndex-1);
        }
        return bi(a, target, pivotIndex+1, e);
    }
    public static int pivot(int a[]){
        int s=0;
        int e=a.length-1;
        while (s<=e) {
            int m=(s+e)/2;
            if (m>s && a[m-1]>a[m]) {
                return m-1;
            }
            if (m<e && a[m]>a[m+1]) {
                return m;
            }
            if(a[s]>a[m]){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
    public static int bi(int a[],int target, int s, int e){
        while (s<=e) {
            int m= (s+e)/2;
            if (target==a[m]) {
                return m;
            }
            if (target>a[m]) {
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
}
