package ie.gmit.dip;

public class QuickSort {
	//Method to swap elements
	static void swap (int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//This takes the first element as pivot, places it in the correct position
	//and places all smaller elements to the left, and all greater elements to the right
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i =(low - 1);
		for (int j =low; j <=high; j++) {
			//If element at index j is bigger that pivot
			if(arr[j] < pivot)
			{
				i++;// Increment index of smaller element
				swap(arr, i , j);
				
				
			}
		}
		swap(arr, i+ 1, high);
		return (i+1);
	}
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			//pi is partitioning index
			int pi = partition(arr, low, high);
			
			//Uses recursion to separately sort the elements before and after partition
			 quickSort(arr, low, pi - 1);
		      quickSort(arr, pi + 1, high);
		}
	}
}
