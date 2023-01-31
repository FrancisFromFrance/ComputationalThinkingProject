package ie.gmit.dip;

public class Runner {
//This is the main method to pass in the values and print out the results in the form of a simple table.
	public static void main(String[] args) {

		System.out.printf("%-16s%-8d%-8d%-8d%-9d%-9d%-9d%-10d%-10d%-10d\n", "Size", 100, 250, 500, 1000, 2500, 5000,
				10000, 15000, 20000);
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		System.out.printf("%-16s%-8s%-8s%-8s%-9s%-9s%-9s%-10s%-10s%-10s\n", "Selection Sort", Helper.select(100),
				Helper.select(250), Helper.select(500), Helper.select(1000), Helper.select(2500), Helper.select(5000),
				Helper.select(10000), Helper.select(15000), Helper.select(20000));
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		System.out.printf("%-16s%-8s%-8s%-8s%-9s%-9s%-9s%-10s%-10s%-10s\n", "Bubble Sort", Helper.bubble(100),
				Helper.bubble(250), Helper.bubble(500), Helper.bubble(1000), Helper.bubble(2500), Helper.bubble(5000),
				Helper.bubble(10000), Helper.bubble(15000), Helper.bubble(20000));
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		System.out.printf("%-16s%-8s%-8s%-8s%-9s%-9s%-9s%-10s%-10s%-10s\n", "Quick Sort", Helper.quick(100),
				Helper.quick(250), Helper.quick(500), Helper.quick(1000), Helper.quick(2500), Helper.quick(5000),
				Helper.quick(10000), Helper.quick(15000), Helper.quick(20000));
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		System.out.printf("%-16s%-8s%-8s%-8s%-9s%-9s%-9s%-10s%-10s%-10s\n", "Heap Sort", Helper.heap(100),
				Helper.heap(250), Helper.heap(500), Helper.heap(1000), Helper.heap(2500), Helper.heap(5000),
				Helper.heap(10000), Helper.heap(15000), Helper.heap(20000));
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		System.out.printf("%-16s%-8s%-8s%-8s%-9s%-9s%-9s%-10s%-10s%-10s\n", "Bucket Sort", Helper.bucket(100),
				Helper.bucket(250), Helper.bucket(500), Helper.bucket(1000), Helper.bucket(2500), Helper.bucket(5000),
				Helper.bucket(10000), Helper.bucket(15000), Helper.bucket(20000));
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

	}

}
