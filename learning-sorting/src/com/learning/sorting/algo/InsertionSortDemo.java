package com.learning.sorting.algo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortDemo {

	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			System.out.print("\n\ni : " + i + " iteration : ");
			display(arr);
			System.out.println();
			int key = arr[i];

			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				System.out.print("\nj : " + j + " iteration : ");
				display(arr);
				j = j - 1;
			}

			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr);
		System.out.print("\nAfter sorted arrays : ");
		display(arr);
		sc.close();
	}

	private static void display(int[] arr) {

		System.out.println(Arrays.toString(arr));
	}
}
