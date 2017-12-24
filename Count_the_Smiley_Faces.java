/*
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
-A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
-Every smiling face must have a smiling mouth that should be marked with either ) or D.
No additional characters are allowed except for those mentioned.

Valid smiley face examples:
:) :D ;-D :~)

Invalid smiley faces:
;( :> :} :] 
*/

package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count_the_Smiley_Faces {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		ArrayList<String> a = new ArrayList<String>();
		a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); 
		a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
		
		System.out.println(countSmileys(a));
	}
	
	public static int countSmileys(List<String> arr) {
		int count = 0;
	    for (int i = 0; i<arr.size(); i++) {
	    		if (validSmiley(arr.get(i))) {
	    			count ++;
	    		}
	    }
	    		
		return count;
	  }

	private static boolean validSmiley(String str) {
		if (str.length() > 3) {
			return false;
		}
		
		if (str.charAt(0) == ':' || str.charAt(0) == ';') {
			if (str.charAt(1) == '-' || str.charAt(1) == '~') {
				if (str.charAt(2) == ')' || str.charAt(2) == 'D') {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				if (str.charAt(1) == ')' || str.charAt(1) == 'D') {
					if (str.length() == 2) {
						return true;
					}
					else {
						return false;
					}					
				}
				else {
					return false;
				}				
			}
		}
		return false;
	}

}
