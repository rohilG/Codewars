package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Noisy_Class {
	
	static boolean isPossible = true;
	static ArrayList<Integer> visited = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int numStudents = input.nextInt();
		int numConnections = input.nextInt();
		
		int[][] loc = new int[numConnections][2];	
		
		for (int i = 0; i<loc.length; i++) {
			loc[i][0] = input.nextInt();
			loc[i][1] = input.nextInt();	
		}		
		
		for (int i = 0; i < loc.length; i++) {
			if (!canStudentShutup(loc[i][0], loc)) {
				isPossible = false;
				break;
			}
			visited.clear();
		}
		
		if (isPossible) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}		
	}

	public static boolean canStudentShutup (int student, int[][] loc) {
		int[] neighbours = neighbours (student, loc);
		
		if (neighbours.length == 0) {
			return true;
		}
		else {
			visited.add(student);
			for (int i = 0; i<neighbours.length; i++) {
				
				for (int j = 0; j<visited.size(); j++) {
					if (neighbours[i] == visited.get(j)) {
						//isPossible = false;	
						return false;
					}
				}
				
				canStudentShutup (neighbours[i], loc);		
				
			}
		}
		
		return true;
	}
	
	public static int[] neighbours (int student, int[][] loc) {
		int count = 0;
		for (int i = 0; i < loc.length; i++) {
			if (student == loc[i][0]) {
				count++;
			}
		}
		
		int[] neighbours = new int[count];
		count = 0;
		
		for (int i = 0; i < loc.length; i++) {
			if (student == loc[i][0]) {
				neighbours[count] = loc[i][1];
				count++;
			}
		}
		
		return neighbours;
	}
}