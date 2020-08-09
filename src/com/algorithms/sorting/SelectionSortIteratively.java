/**
 * Selection Sort
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
 * (considering ascending order) from unsorted part and putting it at the beginning. 
 * The algorithm maintains two subarrays in a given array.
 * 1) The subarray which is already sorted.
 * 2) Remaining subarray which is unsorted.
 * In every iteration of selection sort, the minimum element (considering ascending order) 
 * from the unsorted subarray is picked and moved to the sorted subarray.
 * 
 * Time Complexity: O(n2) as there are two nested loops.
 * Auxiliary Space: O(1)
 * The good thing about selection sort is it never makes more than O(n) swaps and can be useful 
 * when memory write is a costly operation.
 * Stability : The default implementation is not stable. 
 * In Place : Yes, it does not require extra space.
 */
package com.algorithms.sorting;

import java.util.Arrays;

public class SelectionSortIteratively {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 7, 2, 10, 4, 8, 5, 6, 3, 0 };
		selectionSort(arr, arr.length);
	}

	private static void selectionSort(int[] arr, int length) {
		// on each pass, the smallest element will be at the beginning of the unsorted
		// array
		for (int i = 0; i < length - 1; i++) {
			int swapsCount = 0;
			int min_index = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			if (min_index != i) {
				swapsCount = swap(arr, i, min_index, swapsCount);
			}

			System.out.println("Swaps Count:" + swapsCount + " Pass:" + i + Arrays.toString(arr));
		}
	}

	private static int swap(int[] arr, int i, int min_index, int swapsCount) {
		int temp = arr[min_index];
		arr[min_index] = arr[i];
		arr[i] = temp;
		return ++swapsCount;
	}

}
