package StringExample;

import java.util.Scanner;

public class Primenumber_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the start number");
		int t=s.nextInt();
		System.out.println("enter the end number");
		int w=s.nextInt();
	
		for(int i=t;i<=w;i++)
		{
			int e=i/2;
			int q=0;
			if(i==0||i==1)
			{
				//System.out.println(i+ "is not a prime number");
			}else
			{
				for(int g=2;g<=e;g++)
				{
					if(i%g==0)
					{
						//System.out.println(i+"is not a prime number");
					q=1;
					break;
					}
				}
		
	if(q==0)
		System.out.println(i+"is a prime number");
		}
		}
	}

}
