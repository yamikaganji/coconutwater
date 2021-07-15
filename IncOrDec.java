package codechef;

import java.util.Scanner;

public class IncOrDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 if(n%4==0)
			 {
			     n=n+1;
			 }
			 else
			 {
			  n=n-1;   
			 }
			System.out.println(n);
		}

	}

}
