// challenge link: https://leetcode.com/problems/pascals-triangle/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> rows = new ArrayList<>();

		rows.add(Arrays.asList(1));

		for (int i = 1; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();
			row.add(1);

			for (int j = 1; j < i; j++) {
				row.add(rows.get(i - 1).get(j - 1) + rows.get(i - 1).get(j));
			}

			row.add(1);
			rows.add(row);
		}

		return rows;
	}
}
