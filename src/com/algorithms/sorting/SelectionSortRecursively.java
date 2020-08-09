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

public class SelectionSortRecursively {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 7, 2, 10, 4, 8, 5, 6, 3, 0 };
		selectionSort(arr, arr.length - 1);
	}

	private static void selectionSort(int[] arr, int index) {
		if (index == 0) {
			return;
		}
		int max_indx = index;
		for (int j = max_indx - 1; j >= 0; j--) {
			if (arr[j] > arr[max_indx]) {
				max_indx = j;
			}
		}
		swap(arr, index, max_indx);
		System.out.println(Arrays.toString(arr));
		selectionSort(arr, index - 1);
	}

	private static void swap(int[] arr, int i, int max_indx) {
		int temp = arr[i];
		arr[i] = arr[max_indx];
		arr[max_indx] = temp;
	}

}
