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

public class BubbleSortIteratively {

	public static void main(String[] args) {
		int[] arr = { 9, 1, 7, 2, 10, 4, 8, 5, 6, 3, 0 };
		bubbleSort(arr, arr.length);
	}

	private static void bubbleSort(int[] arr, int size) {
		// on each pass, the largest element will be at the end of unsorted array.
		for (int i = 0; i < size - 1; i++) {
			int swapsCount = 0;
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					++swapsCount;
				}
				System.out.println("Swaps Count:" + swapsCount + " Pass:" + i + Arrays.toString(arr));
			}
			//System.out.println("Swaps Count:" + swapsCount + " Pass:" + i + Arrays.toString(arr)); 
		}
	}

}
