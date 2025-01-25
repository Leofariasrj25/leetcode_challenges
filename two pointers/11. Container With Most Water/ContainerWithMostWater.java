public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int maxVolume = 0;
		int left = 0;
		int right = height.length - 1;

		for (int i = 0; i < height.length; i++) {
			int volume = 0;

			if (height[left] < height[right]) {
				volume = height[left] * (right - left);
				left++;
			} else {
				volume = height[right] * (right - left);
				right--;
			}

			maxVolume = Math.max(maxVolume, volume);
		}

		return maxVolume;
	}
}
