// challenge link: https://leetcode.com/problems/number-of-senior-citizens/

public class NumberSeniorCitizens {
	public int countSeniors(String[] details) {
		int over60 = 0;
		int firstDigit = 15 - 4;
		int secondDigit = firstDigit + 1;

		for (String detail : details) {
			int age = (detail.charAt(firstDigit) - '0') * 10 + detail.charAt(secondDigit) - '0';

			if (age > 60) {
				over60++;
			}
		}

		return over60;
	}
}
