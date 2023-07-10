package StringExample;

import java.util.StringTokenizer;

public class Stringeample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer St = new StringTokenizer("my name is steve and i live in australia");
		char s[]=new char[10];
		while(St.hasMoreTokens())
		{
			System.out.println(St.nextToken());
			 s[]=St.nextToken();
					}
		
		
		
		

}

	}
