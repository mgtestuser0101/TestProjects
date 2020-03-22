package javaPgms;

import java.util.ArrayList;
import java.util.Collections;
public class LargestNumber {

	public void findLargest() {
		int[] a = { 564, 120, 478, 1235, 41, 2, 568, 102, 365, 185, 210 };
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int x : a)
			alist.add(x);
		Collections.sort(alist);
		System.out.println("The Sorted Array is"+" "+alist);
		System.out.println("The Fifth larget number in the array is" + " " + alist.get(4));
	}
	public static void main(String[] args) {
		LargestNumber obj = new LargestNumber();
		obj.findLargest();

	}

}
