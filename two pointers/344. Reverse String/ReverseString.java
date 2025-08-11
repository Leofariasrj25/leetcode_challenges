// challenge link: https://leetcode.com/problems/reverse-string/description/

public class ReverseString {
	public void reverseString(char[] s) {
		int middle = s.length / 2;

		for (int i = 0; i < middle; i++) {
			char temp = s[i];
			s[i] = s[s.length - i - 1];
			s[s.length - i - 1] = s[i];
		}
	}

	// recursive
	private void reverse(char[] s, int left, int right) {
		if (left >= right) {
			return;
		}

		reverse(s, left + 1, right - 1);
		char temp = s[left];
		s[left] = s[right];
		s[right] = temp;
	}

	public void reverseStringRecursive(char[] s) {
		reverse(s, 0, s.length - 1);
	}
}
