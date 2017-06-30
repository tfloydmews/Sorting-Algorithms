/***********************************
insertionSort.java
Taylor FloydMews
06/30/2017
***********************************/

public class insertionSort {
	public static void sort(int arr[]) {
		int n = arr.length - 1;
		for (int i = 0; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
	}

	public static void main (String[] args) {
		int[] example = {24,2,45,20,56,75,2,56,99,53,12};
		sort(example); //Sorts assigned array
		for(int i:example) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}