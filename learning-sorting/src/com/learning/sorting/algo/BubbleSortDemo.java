package com.learning.sorting.algo;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortDemo {

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			System.out.println("\n\ni : " + i + " iteration : ");
			boolean isSwapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {

				isSwapped = false;
				System.out.print("\nj : " + j + " iteration : ");

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;

				}

				display(arr);
			}
			if (!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr);
		sc.close();
	}

	private static void display(int[] arr) {

		System.out.println(Arrays.toString(arr));
	}
}
