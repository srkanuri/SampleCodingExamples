package me.srikanthkanuri.beginner;

import java.util.ArrayList;

public class MaxHeapBuilder {
   MaxHeap<Integer> mh;
   public MaxHeapBuilder(ArrayList<Integer> ls){
       mh = new MaxHeap<Integer>();
       for(int i = (ls.size())/2; i > 0; i--){
           maxHeapify(ls, i);
       }
       for(Integer i: ls){
           System.out.println(i);
       }

   }

   private void maxHeapify(ArrayList<Integer> ls, int index){
       Integer val = ls.get(index-1);
       int l = index*2;
       int r = l+1;
       int greatest = index;
       if(l <= ls.size()){
           int left = ls.get(l-1);
           if(left > ls.get(greatest-1))
               greatest = l;
       }
       if(r <= ls.size()){
           int right = ls.get(r-1);
           if(right > ls.get(greatest-1))
               greatest = r;
       }
       if(greatest != index){
           ls.set(index-1, ls.get(greatest-1));
           ls.set(greatest-1, val);
           maxHeapify(ls, greatest-1);
       }
   }

   public static void main(String[] args){
       ArrayList<Integer> ls = new ArrayList<>();
       ls.add(4);
       ls.add(6);
       ls.add(5);
       ls.add(1);
       ls.add(8);
       ls.add(3);
       ls.add(0);
       MaxHeapBuilder mhb = new MaxHeapBuilder(ls);
   }
}

class MaxHeap<T>{
    Node<T> root;
    public MaxHeap(){
        root = null;
    }
}


