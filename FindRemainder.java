package codechef;

import java.util.Scanner;

public class FindRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int r=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			r=a%b;
			System.out.println("thr remainder is:"+r);
		}
	}

}
