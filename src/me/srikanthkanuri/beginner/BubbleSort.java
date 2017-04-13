package me.srikanthkanuri.beginner;

public class BubbleSort {
	public int[] sort(int[] ls) {	
		for(int i = ls.length; i>0 ; i--) {
			int idx = 0;
			for (int j = 1; j < i; j++)
				if(ls[idx] < ls[j])
					idx = j;
			if(idx != i-1) {
				int tmp = ls[i-1];
				ls[i-1] = ls[idx];
				ls[idx] = tmp;
			}
		}
		return ls;
	}
}
