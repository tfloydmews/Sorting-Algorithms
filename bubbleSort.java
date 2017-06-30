/***********************************
bubbleSort.java
Taylor FloydMews
06/30/2017
***********************************/

public class bubbleSort {
	public static void sort (int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++){
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j + 1]) { //Check if numbers are out of order
					//Swap numbers in array
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
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