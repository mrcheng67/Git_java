package Li_Kou_practices;

import java.util.ArrayList;


//  https://leetcode.cn/problems/longest-substring-without-repeating-characters/
//  3. 无重复字符的最长子串
public class LiKou03 {
    public static void main(String[] args){
        String s ="abcabcbb";
        LiKou03 a = new LiKou03();
        System.out.println(a.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        int sum=0;
        int max=0;
        ArrayList array = new ArrayList();
        for(int i=0;i<s.length();i++){
            sum=0;
            for(int j=i;j<s.length();j++){
                String a = s.substring(j,j+1);
                if(array.contains(a)){
                    array.clear();
                    break;
                }
                else{
                    array.add(a);
                }
                sum++;
            }
            if(max<sum){
                max = sum;
            }
        }
        return max;
    }
}
