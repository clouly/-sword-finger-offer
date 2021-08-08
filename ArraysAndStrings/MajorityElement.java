package ArraysAndStrings;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int cur = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                cur = num;
            }
            if (num == cur) {
                count++;
            } else {
                count--;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int[] nums = {1, 2, 3, 5, 5, 5, 5, 4, 2};
        System.out.println(m.majorityElement(nums));
    }

    

}
