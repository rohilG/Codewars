package Practice;

import java.util.Scanner;

public class Exes_and_Ohs {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();
		System.out.println(getXO(str));
	}
	
	public static boolean getXO (String str) {
	    int x = 0, o = 0;
	    
	    for (int i = 0; i < str.length(); i++){
	      if (str.toLowerCase().charAt(i) == 'x'){
	        x++;
	      }
	      else if (str.toLowerCase().charAt(i) == 'o'){
	        o++;
	      }
	    }
	    
	    if (x == o){
	      return true;
	    }
	    else{
	      return false;
	    }  
	  }
}
