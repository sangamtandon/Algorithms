/**
 * Basic requirement of binary search is that the array should be sorted.
 * It works on principle of Divide and Conquer.
 * 
 * Problem Statement : Find the index of element 'X' in an array 'A' having 'n' elements 
 * 
 * PSEUDO CODE
 *	1. Initialize head = 0, tail = Array.lenth - 1
 *	2. while head <= tail do
 *		a) mid = floor((head + tail)/2)
 *		b) if A[mid] == X, return mid
 *		c) if A[mid] > X, then set tail = mid - 1
 *		   else if A[mid] < X, then set head = mid + 1
 *	3. Return -1
 *
 */


package com.algorithms.searching;

public class BinarySearchIteratively {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 8, 10, 13 };

		System.out.println("Element is at index: " + binarySearch(10, arr));
	}

	private static int binarySearch(int i, int[] arr) {
		int head, tail, mid;
		head = 0;
		tail = arr.length - 1;

		while (head <= tail) {
			mid = Math.floorDiv((head + tail), 2);
			if (arr[mid] == i) {
				return mid;
			}
			if (arr[mid] < i) {
				head = mid + 1;
			} else
				tail = mid - 1;
		}
		return -1;
	}

}
