package ie.gmit.dip;

public class BubbleSort {
	public void bubbleSort(int[] a) {
		int outer;
		int inner;
		//Loop over each element
		for (outer = a.length - 1; outer > 0; outer--) {
			for (inner = 0; inner < outer; inner++) {
				//If one is bigger than the other, swap them
				if (a[inner] > a[inner + 1]) {
					int temp = a[inner];
					a[inner] = a[inner + 1];
					a[inner + 1] = temp;
				}
			}
		}
	}
}
