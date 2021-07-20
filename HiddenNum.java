package codechef;

import java.util.Scanner;

public class HiddenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		   
		        if(n%2==0)
		        {
		            System.out.println("2 "+n/2);
		        }
		        else{
		            System.out.println(" 1 "+n);
		        }
		    }

	}

}
