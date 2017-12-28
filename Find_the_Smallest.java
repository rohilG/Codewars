package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Find_the_Smallest {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		long num = input.nextLong();
		
		smallest(num);
	}

	public static long[] smallest(long n) {		
		char[] digits = String.valueOf(n).toCharArray();
		long min = digits[0];
		long index = 0;
		// find min 
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] < min) {
				min = digits[i];
				index = i;
			}
		}
		
		long save = digits[0];
		digits[0] = (char) min;
		digits[(int) index] = (char) save;
		
		long[] ans = new long[3];
		ans[0] = Long.parseLong(Arrays.toString(digits));
		ans[1] = index;
		ans[2] = 0; 
		
		
		for (int i = 0; i < ans[0]; i++) {
			System.out.print(digits[i]);
		}
		
		
		return ans;
	}

}
/*
smallest(1000000) --> [1, 0, 6]		010000 
testing(261235, "[126235, 2, 0]");	126235
testing(209917, "[29917, 0, 1]"); 	029917
testing(285365, "[238565, 3, 1]"); 	238565
testing(269045, "[26945, 3, 0]");	026945
testing(296837, "[239687, 4, 1]");	239687
*/