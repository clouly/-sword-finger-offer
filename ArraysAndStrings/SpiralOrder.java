package ArraysAndStrings;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1, x = 0;
        int[] res = new int[(right + 1) * (bottom + 1)];
        while (true) {
            for (int i = left; i <= right; i++) {
                res[x++] = matrix[top][i];
            }
            if (++top > bottom) {
                break;
            }
            for (int i = top; i <= bottom; i++) {
                res[x++] = matrix[i][right];
            }
            if (left > --right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                res[x++] = matrix[bottom][i];
            }
            if (top > --bottom) {
                break;
            }
            for (int i = bottom; i >= top; i--) {
                res[x++] = matrix[i][left];
            }
            if (++left > right) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SpiralOrder s = new SpiralOrder();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int is : s.spiralOrder(matrix)) {
            System.out.println(is);
        }
        System.out.println("=======================");
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int is : s.spiralOrder(matrix2)) {
            System.out.println(is);
        }
    }

}
