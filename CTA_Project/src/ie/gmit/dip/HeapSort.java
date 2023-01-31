package ie.gmit.dip;


public class HeapSort {
	public  void sort(int arr[]) {
		int n = arr.length;

		// Build heap/Binary Tree
		for (int i = n / 2 - 1; i >= 0; i--) 
			heapify(arr, n, i);
		
		// Extract the elements form the heap
		for (int i = n - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// heapify the unsorted array
			heapify(arr, i, 0);
		}
	}

	// Heapify the subtree, i is the index of the root node, arr is the array and n
	// is the size of the heap
	 void heapify(int arr[], int n, int i) {
		//Initialize root node, Initialize left and right nodes
		int largest = i; 
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		
		//If the first, or leftmost, node is larger than the root
		if (l < n && arr[l] > arr[largest]) 
			largest = l;
		
		//If the last, or rightmost,  node is  largest so far
		if (r < n && arr[r] > arr[largest]) 
			largest = r;
		
		//If the root node is not equal to largest
		if(largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
		
		//Use recursion to put the largest element in the correct position
		heapify(arr, n, largest);
		}
	}

}
