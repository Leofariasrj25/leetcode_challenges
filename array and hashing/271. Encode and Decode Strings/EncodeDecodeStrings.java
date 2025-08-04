// challenge link: https://leetcode.com/problems/encode-and-decode-strings

import java.util.*;

public class EncodeDecodeStrings {
	public String encode(List<String> strs) {
		StringBuilder sBuilder = new StringBuilder();

		for (String str : strs) {
			sBuilder.append(str.length() + "#" + str);
		}

		return sBuilder.toString();
	}

	public List<String> decode(String str) {
		List<String> strs = new ArrayList<>();
		int strLength = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				strLength = strLength * 10 + (c - '0');
			} else if (c == '#') {
				strs.add(str.substring(i + 1, i + 1 + strLength));
				i += strLength;
				strLength = 0;
			}
		}

		return strs;
	}
}
