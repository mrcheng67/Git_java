package Li_Kou_practices;

import java.util.ArrayDeque;

/*
*       https://leetcode.cn/problems/valid-parentheses/description/
*       20. 有效的括号
* */
public class LiKou20 {
    public static void main(String[] args){
        String s = "(())";
        LiKou20 LK = new LiKou20();
        boolean a = LK.longestPalindrome(s);
        System.out.println("这段字符串的的回纹子串为:" + a );
    }
    public boolean longestPalindrome(String s) {
        if(s.length()<2){
            return false;
        }
        int i=0;
        ArrayDeque<Character> ad = new ArrayDeque();
        while(true){
            if(s.charAt(i) == '['||s.charAt(i) == '{'||s.charAt(i) == '('){
                ad.push(s.charAt(i));
            }
            else if(!ad.isEmpty()){
                char a = ad.pop();
                if(a=='('&& s.charAt(i) != ')'){
                    return false;
                }
                if(a=='{'&& s.charAt(i) != '}'){
                    return false;
                }
                if(a=='[' && s.charAt(i) != ']'){
                    return false;
                }
            }
            else{
                return false;
            }
            i++;
            if(i==s.length()&&ad.isEmpty()){
                return true;
            }
            else if(i==s.length()){
                return false;
            }
        }
    }
}
