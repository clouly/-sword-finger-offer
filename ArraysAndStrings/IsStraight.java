package ArraysAndStrings;

/**
 * 从扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这 5 张牌是不是连续的。 2 ～ 10 为数字本身，A 为 1，J 为 11，Q 为 12，K 为
 * 13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 */
public class IsStraight {
    public boolean isStraight(int[] nums) {
        int min = 14, max = 0;
        for (int i = 0; i < 5; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] != 0 && nums[i] < min) {
                min = nums[i];
            }
        }
        if (max - min > 4) {
            return false;
        }
        boolean[] flag = new boolean[5];

        for (int i = 0; i < 5; i++) {
            if (nums[i] != 0 && flag[nums[i] - min] == false) {
                flag[nums[i] - min] = true;
            } else if (nums[i] != 0 && flag[nums[i] - min] == true) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsStraight i = new IsStraight();
        System.out.println(i.isStraight(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(i.isStraight(new int[] { 6, 0, 1, 2, 5 }));
    }

}
