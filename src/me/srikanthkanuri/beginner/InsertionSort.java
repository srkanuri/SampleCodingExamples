package me.srikanthkanuri.beginner;

/**
 * Created by Srikar on 4/13/2017.
 */
public class InsertionSort {
    public int[] sort(int[] ls){
        for(int i=1; i<ls.length; i++){
            int j=i-1;
            int marker = ls[i];
            if(ls[j] < marker)
                continue;
            else {
                for (; j >= 0; j--) {
                    if (ls[j] > marker)
                        ls[j+1] = ls[j];
                    else
                        break;
                }
                ls[j+1] = marker;
            }
        }
        return ls;
    }
}
