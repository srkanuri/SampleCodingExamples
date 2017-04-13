package test.me.srikanthkanuri.beginner;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

import me.srikanthkanuri.beginner.BubbleSort;

public class SortingTest {

	@Test
	public void testSort() {
		BubbleSort bs = new BubbleSort();
		int[] test1 = {1,3,81,2,9,34,21,6}, ex1 = {1,2,3,6,9,21,34,81};
		assertEquals(Arrays.toString(ex1), Arrays.toString(bs.sort(test1)));
	}
	
	@Test
	public void testSortAgain() {
		BubbleSort bs = new BubbleSort();
		int[] test2 = {1,3,0,2,9,1,7,6}, ex2 = {0,1,1,2,3,6,7,9};
		assertEquals(Arrays.toString(ex2), Arrays.toString(bs.sort(test2)));
	}

}
