package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class John_vs_Ann {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextInt();
		
		System.out.println(sumAnn(n));
		
		List<Long> ans = john(n);
		
		for (long i = 0; i < ans.size(); i++) {
			System.out.print(ans.get((int) i) + " ");
		}
	}

	public static long sumAnn(long n) {
		long ans = 0;
		ans += annCountSum(n, 0);
		
		return ans;
	}
	
	
	
	public static long sumJohn(long n) {
		long ans = 0;

		for (long i = 0; i < n; i++) {
			ans += johnCount(i);
		}
		
		return ans;
	}
	
	public static long annCountSum (long n, long ans) {		
		if (n == 0) {
			ans += 1;
		}
		else {
			ans += n - johnCountSum(annCountSum(n-1, ans), ans);
		}
		
		return ans;
	}
	
	public static long johnCountSum(long n, long ans) {
		if (n == 0) {
			ans += 1;
		}
		else {
			ans += n - annCountSum(johnCountSum(n-1, ans), ans);
		}
		
		return ans;
	}
	
	public static List<Long> ann(long n) {
		long[] lon = new long[(int) n];
		
		for (long i = 0; i < n; i++) {
			lon[(int) i] = annCount(i);
		}
		
		List<Long> output = new ArrayList<Long>();
		for(long val : lon){
			output.add(val);
		}
		
		return output;
	}
	
	public static List<Long> john(long n) {
		long[] lon = new long[(int) n];
		
		for (long i = 0; i < n; i++) {
			lon[(int) i] = johnCount(i);
		}
		
		List output = new ArrayList();
		for(long val : lon){
			output.add(val);
		}
		
		return output;
	}
	
	public static long annCount (long n) {		
		if (n == 0) {
			return 1;
		}
		else {
			return n - johnCount(annCount(n-1));
		}
	}
	
	public static long johnCount(long n) {
		if (n == 0) {
			return 0;
		}
		else {
			return n - annCount(johnCount(n-1));
		}		
	}
}

/*
john(11) -->  [0, 0, 1, 2, 2, 3, 4, 4, 5, 6, 6]
ann(6) -->  [1, 1, 2, 2, 3, 3]

sum_john(75) -->  1720
sum_ann(150) -->  6930
*/