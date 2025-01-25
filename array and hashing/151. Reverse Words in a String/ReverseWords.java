public class ReverseWords {
	public String reverseWords(String s) {
		if (s.length() == 1) {
			return s;
		}

		StringBuilder sb = new StringBuilder();
		int start = -1;

		for (int i = s.length() - 1; i >= 0; i--) {
			char currChar = s.charAt(i);

			if (currChar != ' ' && start == -1) {
				start = i;
			} else if ((currChar != ' ' && start != -1) && i - 1 < 0 || s.charAt(i - 1) == ' ') {
				addSubString(sb, s, i, start + 1);
				sb.append(" ");
				start = -1;
			}
		}

		sb.setLength(sb.length() - 1); // remove extraneous white space
		return sb.toString();
	}

	public void addSubString(StringBuilder sb, String s, int start, int end) {
		while (start < end) {
			sb.append(s.charAt(start));
			start++;
		}
	}

	public static void main(String[] args) {
		String str1 = "Hello World from Java with love!";

		System.out.println(new ReverseWords().reverseWords(str1));
	}
}
