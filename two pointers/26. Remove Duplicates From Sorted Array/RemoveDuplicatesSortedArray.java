
public class RemoveDuplicatesSortedArray {
	public int removeDuplicates(int[] nums) {
		int uniqSize = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[uniqSize - 1]) {
				nums[uniqSize] = nums[i];
				uniqSize++;
			}
		}

		return uniqSize;
	}
}
