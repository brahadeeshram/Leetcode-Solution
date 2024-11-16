package LeetCode.LengthofLastWord;

public class lastWord {
    public static void main(String[] args) {
        System.out.println(lastWord("Hello world"));
    }
    public static int lastWord(String s){
        String a[]=s.split(" ");
        return a[a.length-1].length();
    }
}
