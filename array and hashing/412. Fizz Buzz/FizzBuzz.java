// challenge link: https://leetcode.com/problems/fizz-buzz

import java.io.*;
import java.util.*;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		Map<Integer, String> msgs = new TreeMap<>();
		msgs.put(3, "Fizz");
		//msgs.put(4, "Foo");
		msgs.put(5, "Buzz");

		Set<Integer> divisors = msgs.keySet();
		StringBuilder sb = new StringBuilder();
		List<String> results = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			sb.setLength(0); // resetting to create a new String.

			for (Integer divisor : divisors) {
				if (i % divisor == 0) {
					sb.append(msgs.get(divisor));
				}
			}

			if (sb.length() == 0) {
				sb.append(i);
			}

			results.add(sb.toString());
		}

		return results;
	}

	public static void main(String[] args) {
		System.out.println(new FizzBuzz().fizzBuzz(24));
	}
}
