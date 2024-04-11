package Li_Kou_practices;

public class LiKou55 {
    public static void main(String[] args){
        int[] nums = {0,2,3};
        LiKou55 LK = new LiKou55();
        LK.uniquePaths(nums);
        //System.out.println("这段字符串的的回纹子串为:" + a );
    }
    public boolean uniquePaths(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max>=i){
                if(nums[i]+i>max){
                    max = nums[i]+i;
                }
                if(i+nums[i]>=nums.length-1){
                    System.out.println("在i点可以"+i);
                    return true;
                }
            }
        }
        return false;
    }
}
