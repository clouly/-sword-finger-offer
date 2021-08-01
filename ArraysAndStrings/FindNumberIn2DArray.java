package ArraysAndStrings;

/**
 * 在一个 n * m
 * 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;

        int x = 0;
        int y = matrix.length - 1;

        while (x < matrix[0].length && y >= 0) {
            if (matrix[y][x] > target) {
                y--;
            } else if (matrix[y][x] < target) {
                x++;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        FindNumberIn2DArray f = new FindNumberIn2DArray();
        int matrix[][] = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };

        int target = 5;
        System.out.println(f.findNumberIn2DArray(matrix, target));

        target = 20;
        System.out.println(f.findNumberIn2DArray(matrix, target));

    }
}
