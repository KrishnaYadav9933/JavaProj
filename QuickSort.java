
//implementation of QuickSort
import java.io.*;
import java.util.Scanner;

class QuickSort {
	static int partition(int[] arr, int low, int high)
	// low- lower index; high- higher index;
	{
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i = i + 1;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return (i + 1);
	}

	static void quick_Sort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quick_Sort(arr, low, pi - 1);
			quick_Sort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		quick_Sort(arr, 0, n - 1);
		System.out.println("Sorted array is as follows: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
