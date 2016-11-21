package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class MissingRangeInteger {

	public List<String> findMissingRange(int[] vals, int start, int end) {
		List<String> ranges = new ArrayList<>();
		int prev = start - 1;
		for (int i = 0; i <= vals.length; i++) {
			int curr = (i == vals.length) ? end + 1 : vals[i];
			if (curr - prev >= 2) {
				ranges.add((prev + 1) + "->" + (curr - 1));
			}
			prev = curr;
		}
		return ranges;
	}

	public static void main(String[] args) {
		MissingRangeInteger obj = new MissingRangeInteger();
		int[] vals = { 1, 4, 78 };
		List<String> list = obj.findMissingRange(vals, 0, 100);
		for (String s : list)
			System.out.println(s);
	}
}