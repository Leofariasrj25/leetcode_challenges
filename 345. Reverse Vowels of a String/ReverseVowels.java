public class ReverseVowels {
	public String reverseVowels(String s) {
		char chars[] = s.toCharArray();
		int left = 0, right = chars.length - 1;

		while (left < right) {
			while (left < right && !isVowel(chars[left]))
				left++;

			while (left < right && !isVowel(chars[right]))
				right--;

			if (left < right) {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				left++;
				right--;
			}
		}

		return new String(chars);
	}

	public boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'u');
	}
}
