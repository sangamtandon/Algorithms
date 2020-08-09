package com.algorithms.sorting;

//Java program for implementation of Heap Sort 
public class HeapSort {

	public void sort(int[] arr) {
		int n = arr.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		for (int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	private void heapify(int[] arr, int n, int i) {
		int largest = i;
		int leftChild = 2 * i + 1;
		int rightChild = 2 * i + 2;

		if (leftChild < n && arr[leftChild] > arr[largest]) {
			largest = leftChild;
		}
		if (rightChild < n && arr[rightChild] > arr[largest]) {
			largest = rightChild;
		}

		if (largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;

			heapify(arr, n, largest);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		HeapSort ob = new HeapSort();
		ob.sort(arr);

		System.out.println("Sorted array is");
		printArray(arr);
	}
}
