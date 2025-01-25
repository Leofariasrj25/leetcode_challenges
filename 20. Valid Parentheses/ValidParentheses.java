
import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.ArrayDeque;

public class ValidParentheses {
	public boolean isValid(String s) {
		Map<Character, Character> parentheses = new HashMap<>();
		parentheses.put('}', '{');
		parentheses.put(')', '(');
		parentheses.put(']', '[');
		Deque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < s.length(); i++) {
			char currChar = s.charAt(i);

			if (!parentheses.containsKey(currChar)) {
				stack.add(currChar);
				continue;
			}

			if (!stack.isEmpty() && parentheses.get(currChar) == stack.getLast()) {
				stack.removeLast();
			} else {
				return false;
			}

		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str1 = "((()))";
		String str2 = "()()()";
		String str3 = "[({})]";

		System.out.println(new ValidParentheses().isValid(str1));
		System.out.println(new ValidParentheses().isValid(str2));
		System.out.println(new ValidParentheses().isValid(str3));
	}
}
