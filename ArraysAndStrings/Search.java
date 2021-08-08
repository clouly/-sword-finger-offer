package ArraysAndStrings;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Search {
    public int search(int[] nums,int target){
        return getRightMargin(nums, target) - getRightMargin(nums, target-1);
    }
    
    int getRightMargin(int[] nums,int target){
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid]<=target){
                left = mid+1;
            } else{
                right = mid -1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        Search s = new Search();
        System.out.println(s.search(nums, 8));
        System.out.println(s.search(nums, 6));
    }
}
