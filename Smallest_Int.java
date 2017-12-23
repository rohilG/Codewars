package Practice;

import java.util.Scanner;

public class Smallest_Int {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] lon = {};
		int min = lon[0];
		
		for (int i = 0; i < lon.length; i++) {
			if (lon[i] < min) {
				min = lon[i];
			}
		}
		
		System.out.print(min);
	}

}
