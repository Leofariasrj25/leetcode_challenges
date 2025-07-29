// challenge link: https://leetcode.com/problems/length-of-last-word/

public class LengthLastWord {
	public int lengthOfLastWord(String s) {
		int i = s.length() - 1;
		int size = 0;

		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
		}

		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
			size++;
		}

		return size;
	}

	// using String trim and split - code golf
	public int lengthOfLastWordApi(String s) {
		String words[] = s.trim().split(" ");

		return words[words.length - 1].length();
	}
}
