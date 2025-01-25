public class StringCompression {
	int i = 0;
	int sequenceSize = 0;

	public int compress(char chars[]) {

		for (int j = 0; j < chars.length; j++) {
			if (j + 1 < chars.length && chars[j] == chars[j + 1]) {
				sequenceSize++;
			} else {
				chars[i] = chars[j];

				if (sequenceSize != 0) {
					addSequenceSize(sequenceSize++, chars);
				}

				sequenceSize = 0;
			}
		}

		return i;
	}

	public void addSequenceSize(int sequenceSize, char[] chars) {
		if (sequenceSize == 0) {
			return;
		}

		addSequenceSize(sequenceSize / 10, chars);
		chars[i] = (char) (sequenceSize % 10);
		i++;
	}
}
