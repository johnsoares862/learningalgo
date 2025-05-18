package com.learning.sorting.algo;

import java.util.Arrays;

public class MergeSortDemo {
	private static int printIndicator = 0;

	public static void main(String[] args) {

		int[] arr = { 5, 1, 4, 3, 2 };

		divide(arr, 0, arr.length - 1);

		System.out.println("After sorting : " + Arrays.toString(arr));
	}

	public static void divide(int[] arr, int si, int ei) {
		System.out.println(++printIndicator + "  divide call : divide(" + Arrays.toString(arr) + ", " + si + ", " + ei);
		if (si >= ei) {
			System.out.println(printIndicator + " Return :" + si + ", " + ei);
			return;
		}
		int mid = si + (ei - si) / 2;
		divide(arr, si, mid);
		divide(arr, mid + 1, ei);
		conquer(arr, si, mid, ei);
	}

	public static void conquer(int arr[], int si, int mid, int ei) {
		System.out.println(++printIndicator + "  conquer call : conquer(" + Arrays.toString(arr) + ", " + si + ", "
				+ mid + ", " + ei);
		int[] merged = new int[ei - si + 1];
		int idx1 = si;
		int idx2 = mid + 1;
		int x = 0;
		while (idx1 <= mid && idx2 <= ei) {
			if (arr[idx1] < arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}
		while (idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while (idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}
		for (int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}

}
