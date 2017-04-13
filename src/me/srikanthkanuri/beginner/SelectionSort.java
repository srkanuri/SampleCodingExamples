package me.srikanthkanuri.beginner;

public class SelectionSort {
    public int[] sort(int[] ls) {
        for(int i = 0; i<ls.length-1 ; i++) {
            int idx = i;
            for (int j = i+1; j < ls.length; j++)
                if(ls[idx] > ls[j])
                    idx = j;
            if(idx != i) {
                int tmp = ls[i];
                ls[i] = ls[idx];
                ls[idx] = tmp;
            }
        }
        return ls;
    }
}
