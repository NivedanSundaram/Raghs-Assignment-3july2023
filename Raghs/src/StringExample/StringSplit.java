package StringExample;

import java.util.Arrays;

//import java.util.Arrays;

public class StringSplit {
	
	public static void main(String[] args) {
		String test="write a java program to find the longest substring in a given sentence australia startling";
		String test1[]=test.split(" ");
		int S = test1.length;
		int [] d=new int[test1.length];
		
		for(int i=0; i<S;i++)
		{
			// System.out.println(test1[i].length()); 
			d[i]= test1[i].length();
			//System.out.println("Values is stred in "+d[i]);
			}
		/*Arrays.sort(d);
		for(int j=0;j<S;j++)
		{
			System.out.println(d[j]);
		} */
		int w;
	     w=d[0];
		for(int z=0;z<S;z++)
		{
			if(d[z]>w) {
				w=d[z];	
			}
		}
		//System.out.println(w);
		for(int x=0;x<S;x++)
		{
		if(d[x]==w)	
		{
			//int index = Arrays.binarySearch(d, x);
			System.out.println("longest substring in the given sentence is " +test1[x]);
		}
		}
		}
	}
