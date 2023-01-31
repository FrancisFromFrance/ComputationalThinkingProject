package ie.gmit.dip;

import java.util.Collections;
import java.util.Vector;


public class BucketSort {

		static void bucketSort(float arr[], int n) {
			if (n <=0)
				return;
			//Create the buckets
			Vector<Float>[] buckets = new Vector[n];
			
			for (int i = 0; i < n; i++) {
				buckets[i] = new Vector<Float>();
			}
			//Put the elements into their buckets
			for(int i = 0; i < n; i++) {
					float idx = arr[i] *n;
					buckets[(int)idx].add(arr[i]); 
			}
			//Sort the buckets
			for(int i =0; i < n; i++) {
				Collections.sort(buckets[i]);
			}
			
			//Link the buckets back together
			int index = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < buckets[i].size(); j++) {
					arr[index++] = buckets[i].get(j);
				}
			}
		}
}
