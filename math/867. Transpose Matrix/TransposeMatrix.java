// challenge link: https://leetcode.com/problems/transpose-matrix

public class TransposeMatrix {
	public int[][] transpose(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] newMatrix = new int[cols][rows];

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				newMatrix[col][row] = matrix[row][col];
			}
		}

		return newMatrix; // there ya go, you bloody bastard!
	}
}
