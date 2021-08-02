package ArraysAndStrings;

/**
 * 
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 * 
 */
public class MinArray {
    public int minArray(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int mid = (right + left) / 2;
            if(numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right --;
            }
            return numbers[left];
        }
        return 0;
    }

    public static void main(String[] args) {
        MinArray m = new MinArray();
        int[] numbers = {3,4,5,1,2};
        System.out.println(m.minArray(numbers));
        int[] numbers2 = {2,2,2,0,1};
        System.out.println(m.minArray(numbers2));
    }
    
}
