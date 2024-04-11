package Li_Kou_practices;

import AllOfShuZu.ArrayList.Deque;

import java.util.ArrayDeque;
/*
//  https://leetcode.cn/problems/longest-palindromic-substring/description/
//  5. 最长回文子串
    现在写两个解法 1. 中心点寻找        2. 动态规划
*/
public class LiKou05 {
    public static void main(String[] args){
        String s = "aaaa";
        LiKou05 LK = new LiKou05();
        String a = LK.longestPalindrome(s);
        System.out.println("这段字符串的的回纹子串为:" + a );
    }
    /**中心点寻找
     * public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s.substring(0,1);
        }
        int j =0;
        int len=0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            int len1 = panduan(s,i,i);
            int len2 = panduan(s,i,i+1);
            len = len1 > len2 ? len1:len2;
            if(max<len){
                max = len;
                j=i;
            }
        }
        System.out.println("长度为: "+max+" 起始地址为: "+j);
        System.out.println("前"+(j-(max/2))+"尾巴"+(j+(max/2)+1));
        return s.substring(j-(max/2),j+(max/2)+1);
    }

    public int panduan(String s,int a,int b){
        while(a>=0&&b<s.length()&&s.charAt(a)==s.charAt(b)){
            a--;
            b++;
        }
        return b-a-1;
    }**/

    //  动态规划
    public String longestPalindrome(String s) {
        int[][] arr = new int[s.length()][s.length()];
        int begin = 0;
        int tail = 0;
        for(int i=0;i<arr.length;i++){
            arr[i][i] = 1;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(i-j<3 || arr[j+1][i-1] == 1){
                        arr[j][i]=1;
                        System.out.println("arr["+j+"]["+i+"] = 1");
                        if(tail-begin<i-j){
                            begin = j;
                            tail = i;
                        }
                    }
                }
                else{
                    arr[j][i]=0;
                    System.out.println("arr["+j+"]["+i+"] = 0");
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                System.out.print("arr[j][i]="+arr[j][i]);
            }
            System.out.println('\n');
        }
        System.out.println("前"+begin+"尾巴"+tail);
        return s.substring(begin,tail+1);
    }
}
