package me.srikanthkanuri.beginner;

import java.util.ArrayList;

public class BinaryTreeBuilder<T> {
	BinaryTree<T> t1;
	public BinaryTreeBuilder(ArrayList<T> ls) {
		//buildTree(t1, ls);
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(6);
		ls.add(1);
		ls.add(8);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		BinaryTreeBuilder<Integer> btb = new BinaryTreeBuilder<>(ls);
	}

}

class BinaryTree<T>{
	Node<T> root;
	public BinaryTree() {
		root = null;
	}
}

class Node<T>{
	T value;
	Node<T> left;
	Node<T> right;

	public Node(T val){
		this.value = val;
		this.left = null;
		this.right = null;
	}
}
