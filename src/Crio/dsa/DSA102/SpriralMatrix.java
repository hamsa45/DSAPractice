package Crio.dsa.DSA102;

import java.util.Scanner;

public class SpriralMatrix{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[][] = spiralMatrixII(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralMatrixII(int n) {
        int sr = 0, er = n - 1, sc = 0, ec = n - 1;
        int i = 1; // Start from 1, not 0
        int[][] mat = new int[n][n];

        while (i <= n * n) { // Fix loop condition

            // Top row (left to right)
            for (int j = sc; j <= ec && i <= n * n; j++) {
                mat[sr][j] = i++;
            }
            sr++;

            // Right column (top to bottom)
            for (int j = sr; j <= er && i <= n * n; j++) {
                mat[j][ec] = i++;
            }
            ec--;

            // Bottom row (right to left)
            for (int j = ec; j >= sc && i <= n * n; j--) {
                mat[er][j] = i++;
            }
            er--;

            // Left column (bottom to top)
            for (int j = er; j >= sr && i <= n * n; j--) {
                mat[j][sc] = i++;
            }
            sc++;
        }
        return mat;
    }

}
