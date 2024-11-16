package LeetCode.ReverseVowelString;


public class reverse {
    public static void main(String[] args) {
        

        System.out.println(reverse("icecream"));
    }   
    public static String reverse(String s){
        char[] c=s.toCharArray();
        
        int i=0;
        int j=c.length-1;
        while (i<j) {
            if (isVow(c[i]) && isVow(c[j])) {
                char temp = c[i];
                c[i]=c[j];
                c[j]=temp;
                j--;
                i++;
            }else if (isVow(c[i])) {
                j--;
            }else if (isVow(c[j])) {
                i++;
            }else{
                i++;
                j--;
            }
        }
        return new String(c);
    } 
    public static boolean isVow(char vow){
        if (vow=='a'|| vow=='e' || vow=='i' || vow=='o' || vow=='u' || vow=='A'|| vow=='E' || vow=='I' || vow=='O' || vow=='U') {
            return true;
        }
        return false;
    }
}
