package Collection;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		HashMap<Employee, Integer> map = new HashMap<>();
		for (int i=1; i<=11000; i++) {
			map.put(new Employee(i, ("Mary" + i)), i);
		}
		
		Employee e = new Employee(12, "John");
		map.put(e, 12);
		
//		System.out.println(map.size());
		long startTime = System.currentTimeMillis();
		System.out.println(map.get(e));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
