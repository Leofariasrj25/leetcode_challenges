import java.util.List;
import java.util.ArrayList;

public class KidMaxCandies {
	public List<Boolean> kidWithCandies(int[] candies, int extraCandies) {
		int max = candies[0];

		for (int i = 1; i < candies.length; i++) {
			max = Math.max(max, candies[i]);
		}

		List<Boolean> results = new ArrayList<>();

		for (int j = 0; j < candies.length; j++) {
			results.add(candies[j] + extraCandies >= max);
		}

		return results;
	}
}
