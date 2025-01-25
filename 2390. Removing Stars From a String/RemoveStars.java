import java.util.List;
import java.util.ArrayList;

public class RemoveStars {
	public String removeStars(String s) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < sb.length(); i++) {
			char currChar = s.charAt(i);

			if (currChar == '*') {
				sb.setLength(sb.length() - 1);
			} else {
				sb.append(currChar);
			}
		}

		return sb.toString();
	}
}
