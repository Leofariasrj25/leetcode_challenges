import java.util.Map;
import java.util.HashMap;

class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Integer> letterCount = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			letterCount.put(s.charAt(i), letterCount.getOrDefault(s.charAt(i), 0) + 1);
			letterCount.put(t.charAt(i), letterCount.getOrDefault(t.charAt(i), 0) - 1);
		}

		for (int val : letterCount.values()) {
			if (val != 0) {
				return false;
			}
		}

		return true;
	}
}
