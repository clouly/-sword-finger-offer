package Mathematics;

/**
 * 数字以 0123456789101112131415…的格式序列化到一个字符序列中。 在这个序列中，第 5 位（从下标 0 开始计数）是 5，第 13
 * 位是 1，第 19 位是 4，等等。
 */
public class FindNthDigit {

    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n - 1) % digit) - '0';

    }

    public static void main(String[] args) {
        FindNthDigit f = new FindNthDigit();
        System.out.println(f.findNthDigit(3));
        System.out.println(f.findNthDigit(11));
        System.out.println(f.findNthDigit(13));
        System.out.println(f.findNthDigit(19));
    }

}
