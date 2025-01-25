public class MergeStringsAlternately {
	public String mergeAlternately(String s1, String s2) {
		StringBuilder sb = new StringBuilder();

		int i = 0;

		for (; i < s1.length() && i < s2.length(); i++) {
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(i));
		}

		String remainder = "";

		if (i < s1.length()) {
			remainder = s1.substring(i);
		} else if (i < s2.length()) {
			remainder = s2.substring(i);
		}

		return sb.append(remainder).toString();
	}
}
