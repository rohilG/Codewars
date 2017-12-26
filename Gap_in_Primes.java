package Practice;

import java.util.Scanner;

public class Gap_in_Primes {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int g = input.nextInt();
		int m = input.nextInt();
		int n = input.nextInt();
		
		// ans is either null or a pair of primes!
		long[] ans = gap(g,m,n);		
	}

	public static long[] gap(int g, long m, long n) {
		long[] ans = new long[2];
		
		for (long i = m; i < n-g + 1; i++) {
			if (isPrime(i) && isPrime(i+g) && noPrimes(i+1,i+g-1)) {
				ans[0] = i;
				ans[1] = i + g;
				return ans;
			}
		}
		
		return null;
		
	}

	private static boolean noPrimes(long l, long m) {
		for (long i = l; i < m; i++) {
			if (isPrime(i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrime(long num) {
		int max = (int) (Math.sqrt(num));
		
		for (int i = 2; i < max + 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
