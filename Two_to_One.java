package Practice;

import java.util.Scanner;

public class Two_to_One {

	public static void main(String[] args) {
		
		
		//Scanner input = new Scanner (System.in);
		//int num = input.nextInt();
		
		System.out.println(longest ("abc", "bcd"));
		
	}

    public static String longest (String s1, String s2) {
		char[] visited = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String unique = "";
		String s = s1 + s2;
		
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j< s.length(); j++) {
				if (visited[i] == (s.charAt(j))) {
					unique += visited[i];
					break;
				}
			}
		}
    		
    		return unique; 
    }
}
