package StringExample;

import java.util.Scanner;

public class Repeating_substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String a=s.nextLine();
		String t=a.toLowerCase();
		String q[]=t.split(" ");
		int w=q.length;
		for(int i=0;i<w;i++)
		{
			int x=1;
			for(int j=i+1;j<w;j++)
			{
				if(q[i].equals(q[j]))
				{
					x+=1;
					q[j]="0";
				}
			}
		if(x>1 && q[i]!="0")
			System.out.println("The word " +q[i]+ " repeats " +x+ "times");			
		}
	}

}
