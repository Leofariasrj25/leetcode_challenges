// challenge link: https://leetcode.com/problems/excel-sheet-column-title

public class ExcelSheetColumnTitle {
	public String convertToTitle(int columnNumber) {
		StringBuilder res = new StringBuilder();

		convert(columnNumber, res);
		return res.toString();

		// interactive version
		// return convertInteractive(columnNumber);

	}

	public void convert(int columnNumber, StringBuilder res) {
		if (columnNumber == 0) {
			return;
		}

		columnNumber--;
		convert(columnNumber / 26, res);

		res.append((char) ('A' + columnNumber % 26));
	}

	public String convertInteractive(int columnNumber) {
		StringBuilder res = new StringBuilder();

		while (columnNumber > 0) {
			columnNumber--;
			res.append((char) ('A' + columnNumber % 26));
			columnNumber = columnNumber / 26;
		}

		return res.reverse().toString();
	}

	public static void main(String[] args) {
		ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

		int[] testInputs = { 1, 26, 27, 28, 52, 53, 701, 702, 703, 1000 };
		String[] expected = { "A", "Z", "AA", "AB", "AZ", "BA", "ZY", "ZZ", "AAA", "ALL" };

		for (int i = 0; i < testInputs.length; i++) {
			int input = testInputs[i];
			String expectedOutput = expected[i];
			// String actualOutput = solution.convertToTitle(input);
			String actualOutput = solution.convertInteractive(input);

			boolean pass = expectedOutput.equals(actualOutput);
			String status = pass ? "✅ PASS" : "❌ FAIL";

			System.out.printf("Input: %d | Expected: %-4s | Actual: %-4s | %s%n",
					input, expectedOutput, actualOutput, status);
		}
	}
}
