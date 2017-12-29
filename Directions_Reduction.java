package Practice;

import java.util.Scanner;

public class Directions_Reduction {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String[] directions = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
		
		String[] ans = dirReduc(directions);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
	
	public static String[] dirReduc(String[] arr) {
        int north = 0, east = 0;
        
        for (int i = 0; i < arr.length; i++) {
        		if (arr[i].equals("NORTH")) {
        			north++;
        		}
        		else if (arr[i].equals("SOUTH")) {
        			north--;
        		}
        		else if (arr[i].equals("EAST")) {
        			east++;
        		}
        		else {
        			east--;
        		}
        }
                
        String[] ans = new String[Math.abs(north) + Math.abs(east)];
        for (int i = 0; i < ans.length; i++) {
        		if (north != 0) {
        			if (north > 0) {
        				ans[i] = "NORTH";
        				north --;
        			}
        			else {
        				ans[i] = "SOUTH";
        				north ++;
        			}
        		}
        		else {
        			if (east > 0) {
        				ans[i] = "EAST";
        				east --;
        			}
        			else {
        				ans[i] = "WEST";
        				east ++;
        			}
        		}
        }
        
		return ans;
    }

}

// [North, South, South, East, West, North, West] -> West