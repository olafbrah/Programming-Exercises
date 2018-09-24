
public class FRQ {
	static int n = 5;
	int j = 5;
	int[] arr = new int[n];
	int[][] arr2D = new int[n][j];

	public static int arraySum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int[] rowSums(int[][] arr2D) {
		int[] rowArr = new int[arr2D.length];
		int row =0;
		for (int[] rowArr1 :arr2D) {
			rowArr1[row]=arraySum(rowArr1);
				
		}
		return rowArr;
	}

	public static boolean isDiverse(int[][] arr2D) {
		int[] sums = rowSums(arr2D);
		for (int i = 0; i < sums.length; i++) {
			for (int j = i + 1; j < sums.length; j++) {
				if (sums[i] == sums[j]) {
					return false;
				}
			}

		}
		return true;
	}
}
