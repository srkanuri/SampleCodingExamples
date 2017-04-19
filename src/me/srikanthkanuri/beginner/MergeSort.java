package me.srikanthkanuri.beginner;

public class MergeSort {
    public void sort(int[] ls, int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;
            if (end - start == 1)
                return;
            sort(ls, start, mid);
            sort(ls, mid, end);
            int[] ls1 = new int[mid - start];
            int[] ls2 = new int[end - mid];
            for (int i = 0; i < end - start; i++) {
                if (i < mid)
                    ls1[i] = ls[i];
                else
                    ls2[i - mid] = ls[i];
            }
            int i = 0, j = 0, k = 0;
            while (i + j < (end - start)) {
                if (i < ls1.length && j < ls2.length) {
                    if (ls1[i] <= ls2[j]) {
                        ls[k] = ls1[i];
                        i++;
                    }
                    if (ls1[i] > ls2[j]) {
                        ls[k] = ls2[j];
                        j++;
                    }
                } else if (i == ls1.length && j < ls2.length) {
                    ls[k] = ls2[j];
                    j++;
                } else if (j == ls2.length && i < ls1.length) {
                    ls[k] = ls1[i];
                    i++;
                }
                k++;
            }
        }
    }
}
