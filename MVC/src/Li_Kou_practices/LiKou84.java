package Li_Kou_practices;

public class LiKou84 {
    public static void main(String[] args){
        int[] nums = {2,4};
        LiKou84 LK = new LiKou84();
        LK.uniquePaths(nums);

    }

    public int uniquePaths(int[] heights) {
        return -1;
    }

    /**         暴力破解 超时     他的暴力方法在于 遍历每个点  然后直接左右延申
     public int uniquePaths(int[] heights) {
        int value = 0;
        int n = 0;
        for(int i=1;i<=heights.length;i++){
            for(int j=0;j<heights.length;j++){
                int max = Integer.MAX_VALUE;
                n = i;
                while(n>0&& j+n<=heights.length){
                    n--;
                    if(max>heights[j+n]){
                        max = heights[j+n];
                    }
                }
                if(value<max*i&&j+n<heights.length){
                    value = max * i;
                }
            }
        }System.out.println(value);
       return value;
    }
     **/
}
