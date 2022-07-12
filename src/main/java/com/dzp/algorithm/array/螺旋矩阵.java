package com.dzp.algorithm.array;

public class 螺旋矩阵 {

    public int[][] generateMatrix(int n) {
        int start = 0;
        int[][] res = new int[n][n];
        int loop = 0;
        int count = 1;
        int i,j;
        while (loop++ < (n >> 1)) {
            // 上侧填充
            for (i = start; i < n - loop; i++) {
                res[start][i] = count++;
            }
            // 右侧填充
            for (j = start; j < n - loop; j++) {
                res[j][i] = count++;
            }
            // 下侧填充
            for (; i > start; i--) {
                res[j][i] = count++;
            }
            // 左侧填充
            for (; j > start; j--) {
                res[j][start] = count++;
            }
            start++;
        }
        if (n % 2 == 1) {
            res[start][start] = count;
        }
        return res;
    }


}
