package Practice;

import java.util.Scanner;

public class Complementary_DNA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String dna = input.nextLine();
		String output = "";
		
		for (int i = 0; i< dna.length(); i++) {
			if (dna.charAt(i) == 'A') {
				output += "T";
			}
			else if (dna.charAt(i) == 'T') {
				output += "A";
			}
			else if (dna.charAt(i) == 'C') {
				output += "G";
			}
			else {
				output += "C";
			}	
		}
		
		System.out.println(output);
	}
}
