// challenge link: https://leetcode.com/problems/contains-duplicate-ii
import java.util.*;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> indexes = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (indexes.containsKey(nums[i])) {
				int j = indexes.get(nums[i]);

				if (Math.abs(i - j) <= k) {
					return true;	
				}
			}

			indexes.put(nums[i], i);
		}

		return false;
	}
}
