package BST;

import java.util.Comparator;

public class MyBST<T> implements Comparator<T> {
	
	private Node<T> root;
	private int count;
	
	public MyBST() {
		this.root = null;
		this.count = 0;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void inOrderTraversal() {
		System.out.println("In order traversal result ");
		inOrderTraversal(root);
	}
	
	public void inOrderTraversal(Node<T> node) {
		if (node != null) {
			inOrderTraversal(node.getLeft());
			System.out.print(node.getData() + ", ");
			inOrderTraversal(node.getRight());
		}
	}
	
	

	@Override
	public int compare(T o1, T o2) {
		
		return 0;
	}
	
	
}
