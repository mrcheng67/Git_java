package Li_Kou_practices;

import java.util.ArrayList;

public class LiKou62 {
    public static void main(String[] args){
        int nums=7;
        int target=3;
        LiKou62 LK = new LiKou62();
        LK.uniquePaths(nums,target);
        //System.out.println("这段字符串的的回纹子串为:" + a );
    }
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        for (int i = 0; i < n; i++) {arr[0][i] = 1;}
        for (int i = 0; i < m; i++) {arr[i][0] = 1;}
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
       // System.out.println(arr[m-1][n-1]);
        return arr[m-1][n-1];

    }
    /***
    public int uniquePaths(int m, int n) {
        int x = findPath(m,n);
        System.out.println(x);
        return x;
    }
    private int findPath(int m, int n) {
        if(m==1||n==1){
            return 1;
        }
        else if(m>1&&n>1) {
            return findPath(m,n-1)+findPath(m-1,n);
        }
         return 1;
    }***/
}
