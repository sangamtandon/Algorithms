/**
 * 
 * Time Complexity: Sorting arrays on different machines. 
 * Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.
 * T(n) = 2T(n/2) + \Theta(n)
 * The above recurrence can be solved either using Recurrence Tree method or Master method. 
 * It falls in case II of Master Method and solution of the recurrence is \Theta(nLogn).
 * Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best)
 * as merge sort always divides the array into two halves and take linear time to merge two halves
 * Auxiliary Space: O(n)
 * Algorithmic Paradigm: Divide and Conquer
 * Sorting In Place: No in a typical implementation
 * Stable: Yes
 * 
 * Merge sort is a divide-and-conquer algorithm, which recursively calls itself on halved portions of the initial collection.
 * Another thing to note is that Merge Sort is an "out-of-place" sorting algorithm. 
 * This means that it does require extra space to store the elements its sorting, 
 * which can cause problems for memory-constrained systems. This is one trade-off of using this algorithm.
 * Although it's one of the quickest and most efficient sorting algorithms with the average time complexity of O(nlogn),
 *  right alongside Quicksort, Timsort, and Heapsort.
 */
package com.algorithms.sorting;

import java.util.Arrays;

public class MergeSortRecursively {

	public static void main(String[] args) {
		int[] array = { 9, 1, 7, 2, 10, 4, 8, 5, 6, 3, 0 };
		mergeSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	private static void mergeSort(int[] array, int beg, int end) {
		if (end <= beg)
			return;
		int mid = (beg + end) / 2;
		System.out.println("Array: " + Arrays.toString(array) + " Beg: " + beg + " End: " + end + " Mid: " + mid);
		mergeSort(array, beg, mid);
		mergeSort(array, mid + 1, end);
		merge(array, beg, mid, end);
	}

	private static void merge(int[] array, int beg, int mid, int end) {
		int[] leftArray = new int[mid - beg + 1];
		int[] rightArray = new int[end - mid];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = array[beg + i];
		}
		for (int j = 0; j < rightArray.length; j++) {
			rightArray[j] = array[mid + j + 1];
		}
		System.out.println("LeftArray: " + Arrays.toString(leftArray) + " RightArray: " + Arrays.toString(rightArray)
				+ " Beg: " + beg + " End: " + end + " Mid: " + mid);
		int leftIndex = 0;
		int rightIndex = 0;

		// Copying from leftArray and rightArray back into array
		for (int i = beg; i < end + 1; i++) {
			 // If there are still uncopied elements in R and L, copy minimum of the two
			if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
				if (leftArray[leftIndex] < rightArray[rightIndex]) {
					array[i] = leftArray[leftIndex];
					leftIndex++;
				} else {
					array[i] = rightArray[rightIndex];
					rightIndex++;
				}
			} else if (leftIndex < leftArray.length) {
				// If all elements have been copied from rightArray, copy rest of leftArray
				array[i] = leftArray[leftIndex];
				leftIndex++;
			} else if (rightIndex < rightArray.length) {
				// If all elements have been copied from leftArray, copy rest of rightArray
				array[i] = rightArray[rightIndex];
				rightIndex++;
			}
		}
		System.out.println("Final Array: " + Arrays.toString(array));
	}
}
