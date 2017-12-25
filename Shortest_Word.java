package Practice;

import java.util.Scanner;

public class Shortest_Word {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String words = input.nextLine();
		
		System.out.println(findShort(words));
	}
	
	public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortest = words[0].length();
        
        for (int i = 0; i < words.length; i++){
          if (words[i].length() < shortest){
            shortest = words[i].length();
          }
        }
        
        return shortest;
    }

}
