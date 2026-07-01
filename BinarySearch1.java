package BinarySearch;

public class BinarySearch1 {

	// Iterative binary search. Returns index of target or -1 if not found.
	public static int binarySearch(int[] a, int target) {
		int lo = 0, hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] == target) return mid;
			if (a[mid] < target) lo = mid + 1;
			else hi = mid - 1;
		}
		return -1;
	}

	// Recursive binary search wrapper
	public static int binarySearchRecursive(int[] a, int target) {
		return bsRec(a, target, 0, a.length - 1);
	}

	private static int bsRec(int[] a, int target, int lo, int hi) {
		if (lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if (a[mid] == target) return mid;
		if (a[mid] < target) return bsRec(a, target, mid + 1, hi);
		return bsRec(a, target, lo, mid - 1);
	}

	// Simple demonstration
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11};
		int target = 7;
		System.out.println(binarySearch(arr, target)); // expect 3
		System.out.println(binarySearchRecursive(arr, 4)); // expect -1
	}

}
