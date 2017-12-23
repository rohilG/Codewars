package Practice;

import java.util.Scanner;

public class Spongebob_Meme_Generator {

	public static void main(String[] args) {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		boolean isUp = false;
		boolean isAlphabet = false;

		for (int i = 0; i<N; i++) {
			String a = input.nextLine();
			char[] los = a.toLowerCase().toCharArray();

			for (int j = 0; j < los.length; j++) {		
				for (int k = 0; k<alphabet.length; k++) {
					if (los[j] == alphabet[k]) {
						isAlphabet = true;
						if (isUp) {	
							System.out.print(Character.toUpperCase(los[j]));
							isUp = false;
						}
						else {
							System.out.print(los[j]);
							isUp = true;
						}				
						break;
					}
				}
				if (!isAlphabet) {
					System.out.print(los[j]);
				}
				isAlphabet = false;
			}			
			isUp = false;
			System.out.print("\n");
		}

	}

}
