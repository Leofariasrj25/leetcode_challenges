public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		int left = 0, right = numbers.length - 1;

		while (left < right) {
			int num = numbers[left] + numbers[right];

			if (num == target) {
				break;
			} else if (num < target) {
				left++;
			} else {
				right--;
			}
		}

		return new int[] { left + 1, right + 1 };
	}
}
