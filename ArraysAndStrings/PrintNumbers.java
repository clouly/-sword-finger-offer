package ArraysAndStrings;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
public class PrintNumbers {
    public int[] printNumbers1(int n) {
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *= 10;
        }
        int[] res = new int[sum - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
        return res;
    }

    public int[] printNumbers2(int n) {
        int[] res = new int[(int) Math.pow(10, n) - 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('0');
        }
        int count = 0;
        while (!increment(sb)) {
            int index = 0;
            while (index < sb.length() && sb.charAt(index) == '0') {
                index++;
            }
            res[count] = Integer.parseInt(sb.toString().substring(index));
            count++;
        }
        return res;
    }

    public boolean increment(StringBuilder sb) {
        boolean isCarry = false;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char s = (char) (sb.charAt(i) + 1);
            if (s > '9') {
                sb.replace(i, i + 1, "0");
                if (i == 0) {
                    isCarry = true;
                }
            } else {
                sb.replace(i, i + 1, String.valueOf(s));
                break;
            }

        }
        return isCarry;
    }

    public static void main(String[] args) {
        PrintNumbers p = new PrintNumbers();
        int n = 2;
        System.out.println(p.printNumbers1(n).length);
        System.out.println(p.printNumbers2(n).length);
    }

}
