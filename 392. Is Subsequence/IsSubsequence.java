public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		int i = 0, j = 0;

		for (; i < s.length() && j < t.length(); i++) {
			if (s.charAt(i) == t.charAt(j)) {
				j++;
			}
		}

		return j == s.length();
	}
}
