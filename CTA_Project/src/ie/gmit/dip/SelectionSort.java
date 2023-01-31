package ie.gmit.dip;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) { 
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			
			int min_ind = i;//The minimum element in the unsorted array
			for (int j = i + 1; j < n; j++) //Loop over the unsorted array top find the minimum element
				if (arr[j] < arr[min_ind]) { //To sort in descending order change < to >
					min_ind = j; //Set the minimum element 
					}
			
			int temp = arr[min_ind];
			arr[min_ind] = arr[i];
			arr[i] = temp; //Put the minimum element at the start of the array
		}
	}
}
