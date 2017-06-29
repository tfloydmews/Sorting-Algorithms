/**********************************
Taylor FloydMews
Mergesort Algorithm Implementation
06/29/2017
***********************************/

public class Mergesort {
	public static void merge(int arr[], int left, int pivot, int right) {
		//Find sizes of two subarrays to merge
		int n1 = pivot - left + 1;
		int n2 = right - pivot;

		//Create temporary arrays
		int L[] = new int [n1];
		int R[] = new int [n2];

		//Copy data to temporary arrays
		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[pivot + 1 + j];
		}

		//Merge the arrays
		int i = 0, j = 0, k = left; //Set indexes of subarrays and merged subarray
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		//Copy any remaining elements of left array
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		//Copy any remaining elements of right array
		while (i < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void sort(int arr[], int left, int right) {
		if (left < right) {
			//Find pivot point in middle
			int pivot = (left + right) / 2;

			//Sort first and second halves of array
			sort(arr, left, pivot);
			sort(arr, pivot + 1, right);

			//Merge sorted halves
			merge(arr, left, pivot, right);
		}
	}

	public static void main (String [] args) {
		int[] example = {24,2,45,20,56,75,2,56,99,53,12};
		sort(example, 0, example.length - 1); //Sorts assigned array and assigns left and right marker starting value
		for (int i:example) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}