
class Test {
	static int arr[] = { 5, 15, 6, 9, 4 };

	// Recursive Method to search key in the array
	static int linearsearch(int arr[], int size, int key)
	{
		// if (size == 0) {
		// 	return -1;
		// }
		// else if (arr[size - 1] == key) {

		// 	// Return the index of found key.
		// 	return size - 1;
		// }
		// else {
			return linearsearch(arr, size - 1, key);
		// }
	}

	// Driver method
	public static void main(String[] args)
	{
		int key = 4;

		// Function call to find key
		int index = linearsearch(arr, arr.length, key);
		if (index != -1)
			System.out.println(
				"The element " + key + " is found at "
				+ index + " index of the given array.");

		else
			System.out.println("The element " + key
							+ " is not found.");
	}
}

// This Code is submitted by Susobhan Akhuli


// RECURSIVE APPROACH TO FIND FACTORIAL OF NUMBER

// class recursiveAprroachLinearSearch {
// public static int fact(int num) {
// if (num <= 1) {
// return 1;
// } else {

// return num * fact(num - 1);
// }
// }

// public static void main(String args[]) {
// int x = 5, res = 1;
// // for (int i = 1; i <= x; i++) {
// // res = i * res;
// // }
// res = fact(x);
// System.out.print(res);

// }
// }