package Li_Kou_practices;

public class LiKou34 {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target=6;
        LiKou34 LK = new LiKou34();
        LK.searchRange(nums,target);
        //System.out.println("这段字符串的的回纹子串为:" + a );
    }
    public int[] searchRange(int[] nums, int target) {
        int a = findnum(nums,target,0,nums.length);
        int[] arr = {a,a};
        if(a==-1){
            arr[0] = -1;
            arr[1] = -1;
        }
        while(arr[0]>0||arr[1]<nums.length-1){
            if(arr[0]>0&&nums[arr[0]-1] == target){
                arr[0] = arr[0] - 1;
            }
             else if(arr[1]<nums.length-1&&nums[arr[1]+1] == target){
                 arr[1] = arr[1] + 1;
             }else {
                 return arr;
             }
        }
        System.out.println(arr[0]+"这个字符串为"+arr[1]);
        return arr;
    }
    public int findnum(int[] nums,int target,int a,int b){
        if(a>=b||(a==(a+b)/2&&nums[a]!=target)){
            return -1;
        }
        if (nums[(a+b)/2]==target) {
            return (a+b)/2;
        }
        if(nums[(a+b)/2]<target){
            return findnum(nums,target,(a+b)/2,b);
        }else if(nums[(a+b)/2]>target){
            return findnum(nums,target,a,(a+b)/2);
        }
        return -1;
    }
}
