package Practice;

import java.util.Scanner;

public class Dubstep {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();
		
		SongDecoder(str);
	}

	public static String SongDecoder (String song) {
		String ab = song.replace("WUB", " ");
		String answer = ab;
		
		for (int i = 0; i < song.length(); i++) {
			answer = answer.replace("  "," ");
		}
		
		return answer.trim();
	}
}
