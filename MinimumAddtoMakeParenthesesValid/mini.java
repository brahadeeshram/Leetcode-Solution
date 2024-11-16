package LeetCode.MinimumAddtoMakeParenthesesValid;

public class mini {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())("));
    }
    
    public static int minAddToMakeValid(String s){ // ()(
        int left=0;
        int count=0;
        for (char c : s.toCharArray()) {
            if (c=='(') {
                left++;
            }else{
                if (left==0) {
                    count++;
                }else{
                    left--;
                }
            }
        }
        return count + left;
    }
}
