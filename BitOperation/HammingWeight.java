package BitOperation;

/**
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。 例如，把 9  表示成二进制是 1001，有 2 位是 1。
 * 因此，如果输入9，则该函数输出 2。
 */
public class HammingWeight {

    public int hammingWeight1(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        HammingWeight h = new HammingWeight();
        int n = 9;
        System.out.println(h.hammingWeight1(n));
        System.out.println(h.hammingWeight2(n));
    }

}
