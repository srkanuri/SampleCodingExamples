package me.srikanthkanuri.beginner;

import java.util.ArrayList;

public class BinarySearchTreeBuilder{
    BinarySearchTree<Integer> bst1;
    public BinarySearchTreeBuilder(ArrayList<Integer> ls){
        bst1 = new BinarySearchTree<>();
        for(Integer val: ls)
            insert(val);
    }

    private void insert(Integer val){
        Node<Integer> tmp = new Node<>(val);
        if(bst1.root == null)
            bst1.root = tmp;
        else{
            Node<Integer> curr = bst1.root;
            Node<Integer> prev = null;
            while(curr != null){
                prev = curr;
                if(curr.value < val)
                    curr = curr.right;
                else if(curr.value >= val)
                    curr = curr.left;
            }
            if(prev.value > val)
                prev.left = tmp;
            else
                prev.right = tmp;
        }
    }
}

class BinarySearchTree<T> extends BinaryTree<T>{
    public BinarySearchTree(){
        root = null;
    }
}