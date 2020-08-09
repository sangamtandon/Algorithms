/**
 * Insertion Sort
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * Consider the array divided in to parts: sorted elements on left and unsorted on right
 * We pick an element from unsorted array and define it as key.
 * keep on shifting the position of the elements in sorted array bigger than key to the right.
 * Finally INSERT the key in it's correct position created after shifting.
 * 
 * Time Complexity: O(n*2)
 * Auxiliary Space: O(1)
 * Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order.
 * And it takes minimum time (Order of n) when elements are already sorted.
 * Algorithmic Paradigm: Incremental Approach
 * Sorting In Place: Yes
 * Stable: Yes
 * Uses: Insertion sort is used when number of elements is small.
 * It can also be useful when input array is almost sorted, only few elements are misplaced in complete big array.
 */
package com.algorithms.sorting;

import java.util.Arrays;

public class InsertionSortIteratively {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 7, 2, 10, 4, 8, 5, 6, 3, 0 };
		insertionSort(arr, arr.length);
	}

	private static void insertionSort(int[] arr, int length) {
		//on each pass, the key element will be inserted at correct position in sorted array.
		for (int i = 1; i < length; i++) {
			int shiftsCount = 0;
			int key = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > key) {
				arr[j] = arr[j - 1];
				j--;
				++shiftsCount;
			}
			arr[j] = key;
			System.out.println("Shifts Count: " + shiftsCount + " Pass: " + i + Arrays.toString(arr));
		}

	}
}
