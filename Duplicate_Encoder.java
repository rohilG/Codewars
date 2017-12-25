/*
The goal of this exercise is to convert a string to a new string where each character in the new string is
'(' if that character appears only once in the original string, or ')' if that character appears more than once
in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples:

"din" => "((("

"recede" => "()()()"

"Success" => ")())())"

"(( @" => "))(("
*/

package Practice;

import java.util.Scanner;

public class Duplicate_Encoder {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();
		
		System.out.println(encode(str));
	}

	static String encode(String word) {
		word = word.toLowerCase();
		String[] los = word.split("");
		String ans = "";
		
		for (int i = 0; i < los.length; i++) {
			System.out.println(los[i]);
		}
		
		for (int i = 0; i < los.length; i++) {
			if (word.substring(0, i).contains(los[i])){
				ans += ")";
			}
			else if (i<los.length-1 && word.substring(i+1, word.length()).contains(los[i])) {
				ans += ")";
			}
			else {
				ans += "("; 
			}
		}
		
	    return ans;
	  }
}
