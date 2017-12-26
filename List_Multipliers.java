package Practice;

public class List_Multipliers {

	public static boolean comp(int[] a, int[] b) {
		int sum1sq = 0, sum1 = 0, sum2sq = 0, sum2 = 0;

		if (a == null || b == null || a.length != b.length) {
			return false;
		}
		else if (a.length == 0 ){
			return true;
		}
		else {
			for (int i = 0; i < a.length; i++) {
				sum1 += a[i];
				sum1sq += Math.pow(a[i], 2);
				sum2 += b[i];
				sum2sq += Math.pow(b[i], 2);
			}
		}

		return (sum1 == sum2sq || sum2 == sum1sq);	

	}
}