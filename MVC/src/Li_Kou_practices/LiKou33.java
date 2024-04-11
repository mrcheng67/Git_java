package Li_Kou_practices;

public class LiKou33 {
    public static void main(String[] args){
        int[] nums = {3,5,1};
        int target=3;
        LiKou33 LK = new LiKou33();
        LK.longestPalindrome(nums,target);
        //System.out.println("这段字符串的的回纹子串为:" + a );
    }
    public void longestPalindrome(int[] nums, int target) {
        System.out.println(findnum(nums,0,nums.length-1,target));
    }
    public int findnum(int[] nums,int a, int b,int target){
        if(nums[a]==nums[b]||a==(a+b)/2||nums[a]==target||nums[b]==target){
            if(nums[a]==target){
                return a;
            } else if (nums[b]==target){
                return b;
            } else {
                return -1;
            }
        }
        if(nums[(a+b)/2]<nums[b]&&(nums[b]<target||nums[(a+b)/2]>target)){
            return findnum(nums,a,(a+b)/2,target);
        } else if (nums[(a+b)/2]<nums[b]&&nums[(a+b)/2]<target&&nums[b]>target) {
            return findnum(nums,(a+b)/2,b,target);
        } else if (nums[(a+b)/2]>nums[a]&&(nums[(a+b)/2]<target||nums[a]>target)) {
            return findnum(nums,(a+b)/2,b,target);
        } else if (nums[(a+b)/2]>nums[a]&&nums[(a+b)/2]>target&&nums[a]<target) {
            return findnum(nums,a,(a+b)/2,target);
        }else if(nums[(a+b)/2]==target){
            return (a+b)/2;
        }
        return -1;
    }
}
