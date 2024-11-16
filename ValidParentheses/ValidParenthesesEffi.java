package LeetCode.ValidParentheses;

public class ValidParenthesesEffi {
    public static void main(String[] args) {
        System.out.println(isValid("({]})"));
    }
    public static boolean isValid(String s){
        int n=-1;
        char a[]= new char[s.length()];
        for (char c : s.toCharArray()) {
            if (c=='('||c=='{'||c=='[') {
                a[++n]=c;
            }else{
                if (n>=0 && ((c==')' && a[n]=='(') || (c=='}' && a[n]=='{') || (c==']' && a[n]=='['))) {
                    n--;
                }else{
                    return false;
                }
            }
        }
        return n==-1;
    }
}
