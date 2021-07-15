package codechef;

import java.util.Scanner;

public class LuckyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int j=0;j<t;j++)
		    {
		        
		        int count=0;
		        int n=sc.nextInt();
		        while(n>0)
		        {
		       int r=n%10;
		        n=n/10;
		        if(r==4)
		        {
		            count++;
		        }
		        }
		        System.out.println(count);
		    }

	}

}
