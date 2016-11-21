package Collection;

public class MyVector {

	private static final int INIT_SIZE = 10;
	private int[] array;
	private int size;

	public MyVector() {
		array = new int[INIT_SIZE];
		size = 0;
	}

	public synchronized void add(int num) {

		if (isResize()) {
			int[] temp = new int[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			array = temp;
		}
		array[size++] = num;
	}

	public synchronized int get(int index) {

		if (index < 0 || index > size) {
//			throw new RuntimeException("Index out of bound");
			throw new IndexOutOfBoundsException();
		} else {
			return array[index];
		}
	}

	public boolean isResize() {
		return (array.length == size);
	}

	public int getSize() {
		return size;
	}
	
	public int capacity() {
		return array.length;
	}
}
