package test.me.srikanthkanuri.beginner;

import static org.junit.Assert.*;
import java.util.Arrays;

import me.srikanthkanuri.beginner.InsertionSort;
import org.junit.Test;
import me.srikanthkanuri.beginner.BubbleSort;
import me.srikanthkanuri.beginner.SelectionSort;


public class SortingTest {
	int[] test1 = {1,3,81,2,9,34,21,6}, ex1 = {1,2,3,6,9,21,34,81};
	int[] test2 = {1,3,0,2,9,1,7,6}, ex2 = {0,1,1,2,3,6,7,9};
	@Test
	public void testBubbleSort() {
		BubbleSort bs = new BubbleSort();
		assertEquals(Arrays.toString(ex1), Arrays.toString(bs.sort(test1)));
		assertEquals(Arrays.toString(ex2), Arrays.toString(bs.sort(test2)));
	}
	
	@Test
	public void testSelectionSort() {
		SelectionSort ss = new SelectionSort();
		assertEquals(Arrays.toString(ex1), Arrays.toString(ss.sort(test1)));
		assertEquals(Arrays.toString(ex2), Arrays.toString(ss.sort(test2)));
	}

    @Test
    public void testInsertionSort() {
        InsertionSort is = new InsertionSort();
        assertEquals(Arrays.toString(ex1), Arrays.toString(is.sort(test1)));
        assertEquals(Arrays.toString(ex2), Arrays.toString(is.sort(test2)));
    }
}
