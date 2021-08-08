package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 */
public class MinNumber {
    public String minNumber(int[] nums) {
        List<String> strList = new ArrayList<>();
        for (int num : nums) {
            strList.add(String.valueOf(num));
        }
        strList.sort((a, b) -> (a + b).compareTo(b + a));
        StringBuilder sb = new StringBuilder();
        for (String str : strList) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 30, 34, 5, 9 };
        MinNumber m = new MinNumber();
        System.out.println(m.minNumber(nums));
    }

}
