// challenge link: https://leetcode.com/problems/rotate-image

public class RotateImage {
	public void rotate(int[][] matrix) {
		reverse(matrix);
		transpose(matrix);
	}

	private void reverse(int[][] matrix) {
		// reverse vertically
		int n = matrix.length;

		for (int i = 0; i < n / 2; i++) {
			int temp[] = matrix[i];
			matrix[i] = matrix[n - i - 1];
			matrix[n - i - 1] = temp;
		}
	}

	private void transpose(int[][] matrix) {
		// n x n matrix
		int n = matrix.length;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
}
