package codechef;

import java.util.Scanner;

public class Quadrilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		    int s1=0; int s2=0;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		s1=A+C;
		s2=B+D;
		if(s1==s2)
		{
		    System.out.println("Yes");
		}
		else{
		System.out.println("No");
		}
		}
		}

	}

}
