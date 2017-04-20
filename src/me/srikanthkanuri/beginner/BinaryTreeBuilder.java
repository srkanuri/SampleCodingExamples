package me.srikanthkanuri.beginner;

import java.util.ArrayList;

public class BinaryTreeBuilder<T> {
	BinaryTree<T> t1;
	public BinaryTreeBuilder(ArrayList<T> ls) {
		t1 = new BinaryTree<>();
	    t1.root = buildTree(ls, 1);
	}
	public BinaryTreeBuilder(){}

    protected Node<T> buildTree(ArrayList<T> ls, int index){
	    if(index <= ls.size()){
            T value = ls.get(index-1);
	        if(value != null){
	            Node<T> n1 = new Node<>(value);
	            n1.left = buildTree(ls, 2*index);
                n1.right = buildTree(ls, (2*index)+1);
                return n1;
            }
        }
        return null;
    }

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<>();
        ls.add(4);
        ls.add(6);
		ls.add(5);
		ls.add(1);
		ls.add(8);
		ls.add(3);
        ls.add(0);
		BinaryTreeBuilder<Integer> btb = new BinaryTreeBuilder<>(ls);
		btb.t1.print("PreOrder");
		//btb.t1.lca(3, 4);
        //btb.t1.print("InOrder");
        //btb.t1.print("PostOrder");
        BinarySearchTreeBuilder bstb = new BinarySearchTreeBuilder(ls);
        bstb.bst1.print("PreOrder");
	}
}



class BinaryTree<T>{
	Node<T> root;
	public BinaryTree() {
		root = null;
	}

	public void lca(T a, T b){
	    System.out.println(getLca(root, a, b).value);
    }

    private Node<T> getLca(Node<T> curr, T a, T b){
	    if(curr == null)
	        return null;
	    else{
	        if(curr.value == a || curr.value == b)
	            return curr;
	        Node<T> left = getLca(curr.left, a, b);
	        Node<T> right = getLca(curr.right, a, b);
	        if(left != null && right != null)
	            return curr;
            else if(left == null && right == null)
	            return null;
            else if(left != null)
	            return left;
            else
                return right;
        }
    }

	public void print(String order){
	    if(order != null){
	        switch(order.toLowerCase()){
                case "preorder": printPreOrder(root, 0); break;
                case "inorder": printInOrder(root, 0); break;
                case "postorder": printPostOrder(root, 0); break;
                default: throw new IllegalArgumentException("Invalid Order specified. Please enter a correct order.");
            }
        }
    }

	private void printPreOrder(Node<T> val, int height){
	    if(val == null)
	        return;
	    else{
	        int i=0;
	        while(i<height) {
	            i++;
                System.out.print("*");
            }
	        System.out.println(val.value);
	        printPreOrder(val.left, height+1);
	        printPreOrder(val.right, height+1);
        }
    }

    private void printInOrder(Node<T> val, int height){
        if(val == null)
            return;
        else{
            printPreOrder(val.left, height+1);
            int i=0;
            while(i<height) {
                i++;
                System.out.print("*");
            }
            System.out.println(val.value);
            printPreOrder(val.right, height+1);
        }
    }

    private void printPostOrder(Node<T> val, int height){
        if(val == null)
            return;
        else{
            printPreOrder(val.left, height+1);
            printPreOrder(val.right, height+1);
            int i=0;
            while(i<height) {
                i++;
                System.out.print("*");
            }
            System.out.println(val.value);
        }
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
