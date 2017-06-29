public class Quicksort {
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static int partition (int arr[], int left, int right) {
		int pivot = arr[(left + right) / 2]; //Pick a pivot point in the center

		while (left <= right) { //Until searched entire array
			while (arr[left] < pivot) //Find element that should be moved to right half
				left++;
			while (arr[right] > pivot) //Find element that should be moved to left half
				right--;
			if (left <= right) {
				swap(arr, left, right); //Swap numbers out of place
				//Move index marker on both sides
				left++;
				right--;
			}
		}

		return left;
	}

	public static void sort (int arr[], int left, int right) {
		int index = partition(arr, left, right); //Divide the unsorted part of array in half
		if (left < index - 1) { //Sort left half
			sort(arr, left, index - 1);
		}
		if (index < right) { //Sort right half
			sort(arr, index, right);
		}
	}

	public static void main (String[] args) {
		int[] example = {24,2,45,20,56,75,2,56,99,53,12};
		sort(example, 0, example.length - 1);//Sorts assigned array and assigns left and right marker starting value
		for(int i:example){
			System.out.print(i);
			System.out.print(" ");
		}
	}
}