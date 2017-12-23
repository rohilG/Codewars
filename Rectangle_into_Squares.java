package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle_into_Squares {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int lng = input.nextInt();
		int wdth = input.nextInt();
		int area = lng*wdth;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		if (lng == wdth) {
			System.out.println("NULL");
		}
		
		while (area != 0) {
			ans.add((int) Math.floor(Math.sqrt(area)));
			area -= Math.pow((int) Math.floor(Math.sqrt(area)), 2);
		}
		
		//can also iterate through ans and output its elements
		//return ans;

	}

}
