package codechef;

import java.util.Scanner;

public class PuppyandSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			System.out.println("enter d value:");
			int d=sc.nextInt();
			System.out.println("enter n value:");
			int n=sc.nextInt();
			System.out.println(sum(d,n));
		}
	}
	public static int sum(int d,int n)
	{
		int total=0;
		for(int i=1;i<=n;i++)
		{
			total=total+i;
		}
		if(d>1)
		{
		return sum(d-1,total);
		}
		else
		{
			return total;
		}
	}

}
