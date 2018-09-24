package Challenges;

public class rotate {
	// int n;

	public static void main(String[] args) {
		int rotateNum = 2;
		int n = 5;
		long[] arr = new long[n];
		System.out.print("Array length of arr:" + arr.length + "\n");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (long) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.print("\nThe above is array created\n");

		long[] arrRotate = new long[n];
		for (int j = 0; j < arr.length; j++) {

			if (j < (arr.length - rotateNum)) {
				arrRotate[j] = arr[j + rotateNum];

			} else {
				arrRotate[j] = arr[j - (arr.length - rotateNum)];

			}
		}
		System.out.println("\nthe rotated array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arrRotate[i] + " ");

		}

	}

}
