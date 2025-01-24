import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {

	public boolean containsDup(int nums[]) {
		Set<Integer> distinct = new HashSet<>();

		for (int num : nums) {
			if (!distinct.add(num)) {
				return true;
			}
		}

		return false;
	}
}
