package Practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle_into_Squares {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int lng = input.nextInt();
		int wdth = input.nextInt();
		ArrayList<Integer> ans = new ArrayList<Integer>();
	
		if (lng == wdth) {
			System.out.println("null");
		}
		else {
			while (lng != wdth) {
				ans.add(Math.min(lng, wdth));
				if (lng < wdth) {
					wdth -= lng;
				}
				else {
					lng -= wdth;
				}
			}
			ans.add(lng);
			System.out.println(ans);
		}

	}
}

// (610 78) -> [78, 78, 78, 78, 78, 78, 78, 64, 14, 14, 14, 14, 8, 6, 2, 2, 2]
// (5 5) -> null
// (20 14) -> [14, 6, 6, 2, 2, 2]