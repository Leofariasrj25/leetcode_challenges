// challenge link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side

public class ReplaceElements {
	public int[] replaceElements(int[] arr) {
		rightMax = -1;

		for (int i = arr.length - 1; i >= 0; i--) {
			newMax = Math.max(rightMax, arr[i]);
			arr[i] = rightMax;
			rightMax = newMax;
		}

		return arr;
	}
}
