package me.srikanthkanuri.beginner;

public class MergeSort {
    public void sort(int[] ls, int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;
            if(end-start <=1)
                return;
            sort(ls, start, mid);
            sort(ls, mid, end);
            int[] ls1 = new int[mid - start + 1];
            int[] ls2 = new int[end - mid + 1];
            int a = 0,b=0;
            for (; a < mid-start; a++) {
                    ls1[a] = ls[a];
            }
            ls1[a] = 9999999;
            for(; b<end - mid ; b++){
                ls2[b] = ls[mid+b];
            }
            ls2[b] = 9999999;
            int i = 0, j = 0, k = 0;
            while(k < (end-start)){
                    if (ls1[i] <= ls2[j]) {
                        ls[k] = ls1[i];
                        i++;
                    }
                    if (ls1[i] > ls2[j]) {
                        ls[k] = ls2[j];
                        j++;
                    }
                    k++;
            }
        }
    }

}
