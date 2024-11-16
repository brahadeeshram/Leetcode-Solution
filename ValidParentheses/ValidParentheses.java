package LeetCode.ValidParentheses;

// inefficient code
import java.util.*;
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("[]("));
    }
    public static boolean isValid(String s){
        if (s.length()==0||s.length()==1) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c=='(' || c=='{' || c=='[') {
                st.push(c);
            }else{
                if (c==')') {
                    if (st.isEmpty()||st.pop()!='(') {
                        return false;
                    }
                }
                if (c=='}') {
                    if (st.isEmpty()||st.pop()!='{') {
                        return false;
                    }
                }
                if (c==']') {
                    if (st.isEmpty()||st.pop()!='[') {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    } 
}
