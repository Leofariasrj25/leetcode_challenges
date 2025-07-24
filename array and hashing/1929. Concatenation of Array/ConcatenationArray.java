// challenge link: https://leetcode.com/problems/concatenation-of-array/description/

public class ConcatenationArray {
	public int[] getConcatenation(int[] nums) {
		int concatArray[] = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			concatArray[i] = nums[i];
			concatArray[i + nums.length] = concatArray[i];
		}

		return concatArray;
	}
}
