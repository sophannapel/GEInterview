package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		List<Integer> list2 = Arrays.asList(5, 8, 22, 45, 123, 344);
//		 List<Integer> list1 = Arrays.asList(8, 9, 13, 23);
		List<Integer> list1 = null;
		List<Integer> result = new ArrayList<>();
		merge(result, list1, list2, 0, 0);
		System.out.println(result.toString());
	}

	public static void merge(List<Integer> result, List<Integer> list1,
			List<Integer> list2, int index1, int index2) {
		if (list1 == null) {
			if (list2 != null) {
				result.addAll(list2);
			}
		} else if (list2 == null) {
			result.addAll(list1);
		} else {
			if (list1.size() == index1) {
				if (index2 < list2.size()) {
					result.add(list2.get(index2));
					merge(result, list1, list2, index1, 1 + index2);
				}
			} else if (list2.size() == index2) {
				result.add((list1.get(index1)));
				merge(result, list1, list2, 1 + index1, index2);
			} else {
				if (list1.get(index1) <= list2.get(index2)) {
					result.add(list1.get(index1));
					merge(result, list1, list2, 1 + index1, index2);
				} else {
					result.add(list2.get(index2));
					merge(result, list1, list2, index1, 1 + index2);
				}
			}
		}
	}
}
