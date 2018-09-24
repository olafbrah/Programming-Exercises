package Challenges;

public class stringNumbers {
	int num;
	static String a;

	public static void main(String[] args) {
		int n = 10;
		String[] arr = new String[n+1];

		for (int i = 0; i <= arr.length; i++) {
			String[] subArr = new String[i];

			for (int j = 1; j < i; j++) {
				if((Integer.toString(i)).length()>1) {
					Integer.toString(i);
				}
				
				switch (j) {
				
				case 1:
					a = "ONE";
					break;
				case 2:
					a = "TWO";
					break;
				case 3:
					a = "THREE";
					break;
				case 4:
					a = "FOUR";
					break;
				case 5:
					a = "FIVE";
					break;
				case 6:
					a = "SIX";
					break;
				case 7:
					a = "SEVEN";
					break;
				case 8:
					a = "EIGHT";
					break;
				case 9:
					a = "NINE";
					break;
						
				}
				subArr[j] = a;
				System.out.print(subArr[j]+",");
			}
		}
	}
}
