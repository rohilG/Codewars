package Practice;

import java.util.Scanner;

public class Tribonacci_Sequence {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double[] s = {input.nextInt(), input.nextInt(), input.nextInt()};
		int n = input.nextInt();

		//returns a list of integers
		tribonacci(s, n);
		
	}

	public static double[] tribonacci(double[] s, int n) {
		double[] ans = new double[n];

		if (n == 0){
			return ans;
		}
		else if (n == 1){
			ans[0] = s[0];
			return ans;
		}
		else if (n == 2){
			ans[0] = s[0];
			ans[1] = s[1];
			return ans;
		}
		else if (n == 3){
			ans[0] = s[0];
			ans[1] = s[1];
			ans[2] = s[2];
			return ans;
		}
		else{
			ans[0] = s[0];
			ans[1] = s[1];
			ans[2] = s[2];
		}

		for (int i = 3; i< ans.length; i++){
			ans[i] = ans[i-1] + ans[i-2] + ans[i-3];
		}

		return ans;
	}
}
