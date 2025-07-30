public class MaxNumberOfVowelsInString {

	// 'growing' window.
	public int maxVowels(String s, int k) {
		int left = 0, right = 0;
		int currVowelCount = 0;
		int maxVowelCount = 0;

		while (right < s.length()) {
			if (isVowel(s.charAt(right))) {
				currVowelCount++;
			}

			if (right - left + 1 > k) {
				if (isVowel(s.charAt(left))) {
					currVowelCount--;
				}

				left++;
			}

			maxVowelCount = Math.max(maxVowelCount, currVowelCount);
			right++;
		}

		return maxVowelCount;
	}

	// fixed sliding window version.
	public int maxVowelsV2(String s, int k) {
		int vowelCount = 0;
		int maxVowelCount = 0;

		for (int i = 0; i < k; i++) {
			if (isVowel(s.charAt(i)) {
				vowelCount++;
			}
		}

		maxVowelCount = vowelCount;
		vowelCount = 0;

		for (int i = 1, j = k - 1; j < s.length(); i++, j++) {
			if (isVowel(s.charAt(i - 1)) {
				vowelCount--;
			}

			if (isVowel(s.charAt(j)) {
				vowelCount++;
			}

			maxVowelCount = Math.max(vowelCount, maxVowelCount);
		}

		return maxVowelCount;
	}

	public boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) {
		testMaxVowels();
	}

	public static void testMaxVowels() {
		// Case 1: Standard case with mixed characters
		MaxNumberOfVowelsInString maxV = new MaxNumberOfVowelsInString();
		assert maxV.maxVowels("abciiidef", 3) == 3 : "Test case 1 failed";

		// Case 2: No vowels in the string
		assert maxV.maxVowels("bcdfghjklmnpqrstvwxyz", 5) == 0 : "Test case 2 failed";

		// Case 3: All vowels in the string
		assert maxV.maxVowels("aeiouaeiou", 5) == 5 : "Test case 3 failed";

		// Case 4: Single character (vowel)
		assert maxV.maxVowels("a", 1) == 1 : "Test case 4 failed";

		// Case 5: Single character (non-vowel)
		assert maxV.maxVowels("z", 1) == 0 : "Test case 5 failed";

		// Case 6: Substring length equals string length
		assert maxV.maxVowels("hello", 5) == 2 : "Test case 6 failed";

		// Case 7: String shorter than the substring length
		assert maxV.maxVowels("world", 10) == 1 : "Test case 7 failed";

		// Case 8: Empty string
		assert maxV.maxVowels("", 3) == 0 : "Test case 8 failed";

		System.out.println("All test cases passed!");
	}
}
