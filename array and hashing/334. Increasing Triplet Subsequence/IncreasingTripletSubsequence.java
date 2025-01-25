public class IncreasingTripletSubsequence {
	public boolean increasingTriplet(int nums[]) {
		if (nums.length < 3) {
			return false;
		}

		int minValue = Integer.MAX_VALUE;
		int secondMinValue = Integer.MAX_VALUE;

		for (int num : nums) {
			if (num <= minValue) {
				minValue = num;
			} else if (num <= secondMinValue) {
				secondMinValue = num;
			} else {
				return true;
			}
		}

		return false;
	}
}
