package ArraysAndStrings;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class Exchange {

    public int[] exchange(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            while (start < end && (nums[start] % 2) == 1) {
                start++;
            }
            while (start < end && (nums[end] % 2) == 0) {
                end--;
            }
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Exchange e = new Exchange();
        int[] nums = e.exchange(new int[]{1,2,3,4});
        for (int i : nums) {
            System.out.println(i);
        }
    }

}
