package ie.gmit.dip;

import java.text.DecimalFormat;
//This is a helper class. The only function of this class is to keep all my methods neat and avoid clutter throughout my project.
//I have used Decimal Format here to make the output more presentable.
public class Helper {
	//This generates an array of random numbers.
	static int[] randomArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

//This is a separate array for floats to assist the bucket sort sorting algorithm
	static float[] randomFloatArray(int n) {
		float[] array = new float[n];
		for (int i = 0; i < n; i++) {
			array[i] = (float) (Math.random());
		}
		return array;
	}

	public static String select(int arraySize) {
		int arr[] = randomArray(arraySize);
		long startTime = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			SelectionSort.selectionSort(arr);
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		double elapsedMillis = timeElapsed / 1000000;
		DecimalFormat df = new DecimalFormat("0.000");
		return df.format(elapsedMillis / 10);
	}

	public static String quick(int arraySize) {
		int arr[] = randomArray(arraySize);
		int n = arr.length;
		long startTime1 = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			QuickSort.quickSort(arr, 0, n - 1);
		}
		long endTime1 = System.nanoTime();
		long timeElapsed1 = endTime1 - startTime1;
		double elapsedMillis = timeElapsed1 / 1000000;
		DecimalFormat df = new DecimalFormat("0.000");
		return df.format(elapsedMillis / 10);

	}

	public static String bucket(int arraySize) {
		float arr[] = randomFloatArray(arraySize);
		long startTime = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			BucketSort.bucketSort(arr, arraySize / 10); //I have chosen the number of buckets here to be 10
														
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		double elapsedMillis = timeElapsed / 1000000;
		DecimalFormat df = new DecimalFormat("0.000");
		return df.format(elapsedMillis / 10);
	}

	public static String heap(int arraySize) {
		int arr[] = randomArray(arraySize);
		long startTime = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			HeapSort heapSort = new HeapSort();
			heapSort.sort(arr);
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		double elapsedMillis = timeElapsed / 1000000;
		DecimalFormat df = new DecimalFormat("0.000");
		return df.format(elapsedMillis / 10);
	}

	public static String bubble(int arraySize) {
		int arr[] = randomArray(arraySize);
		long startTime = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			BubbleSort bs = new BubbleSort();
			bs.bubbleSort(arr);
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		double elapsedMillis = timeElapsed / 1000000;
		DecimalFormat df = new DecimalFormat("0.000");
		return df.format(elapsedMillis / 10);
	}
}
