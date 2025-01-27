public class MaxAvgSubarrayI {
	public double findMaxAverage(int nums[], int k) {
		double maxSum = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}

		for (int i = k; i < nums.length; i++) {
			sum += nums[i];
			sum -= nums[i - k];

			Math.max(maxSum, sum);
		}

		return maxSum / (k * 1.0);
	}
}
