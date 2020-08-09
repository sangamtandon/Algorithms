/**
 * Bubble Sort
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly 
 * swapping the adjacent elements if they are in wrong order.
 * 
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
 * Auxiliary Space: O(1)
 * Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
 * Sorting In Place: Yes --> In Place means sorting is done in same array. No new array introduced. 
 * Stable: Yes --> It means if two elements with same value are present in array at two different location,
 * they will be sorted in the same order they appeared in original array.
 */
package com.algorithms.sorting;

import java.util.Arrays;

public class BubbleSortRecursively {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 7, 2, 10, 4, 8, 5, 6, 3, 0 };
		bubbleSort(arr, arr.length);
	}

	private static void bubbleSort(int[] arr, int size) {

		if (size == 1)
			return;

		for (int i = 0; i < size - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}

		bubbleSort(arr, size - 1);
	}

}
