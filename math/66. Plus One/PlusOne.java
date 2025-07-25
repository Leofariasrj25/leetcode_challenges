// challenge link: https://leetcode.com/problems/plus-one

public class PlusOne {
	public int[] plusOne(int[] digits) {
		boolean carryOver = false;
		int i = digits.length - 1;
		int sum = 0;

		do {
			sum = digits[i] + 1;
			carryOver = (digits[i] / 10 == 1);
			digits[i] = sum % 10;
			i--;
		}
		while (i >= 0 && carryOver);
		
		if (carryOver) {
			digits = new int[digits.length + 1];
			digits[0] = 1;
		}

		return digits;
	}
}
