package ArraysAndStrings;

/**
 * 一个长度为 n-1 的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围 0～n-1 之内。 在范围 0～n-1 内的 n
 * 个数字中有且只有一个数字不在该数组中，请找出这个数字。
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - 1) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return left;
    }

    public static void main(String[] args) {
        MissingNumber m = new MissingNumber();
        System.out.println(m.missingNumber(new int[] { 0, 1, 3 }));
        System.out.println(m.missingNumber(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 9 }));
    }

}
