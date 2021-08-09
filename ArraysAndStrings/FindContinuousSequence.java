package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 */
public class FindContinuousSequence {

    public int[][] findContinuousSequence(int target) {
        int left = 1;
        int right = 2;
        List<int[]> res = new ArrayList<>();

        while (left < right) {
            int sum = (left + right) * (right - left + 1) / 2;
            if (sum == target) {
                int[] arr = new int[right - left + 1];
                for (int k = left; k <= right; k++) {
                    arr[k - left] = k;
                }
                res.add(arr);
                left++;
            } else if (sum < target) {
                right++;
            } else {
                left++;
            }

        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        FindContinuousSequence f =new FindContinuousSequence();
        int target = 15;
        int[][] r = f.findContinuousSequence(target);
        for (int[] is : r) {
            for (int is2 : is) {
                System.out.println(is2);
            }
           System.out.println("======");
        }
    }

}
