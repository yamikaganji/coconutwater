package codechef;

import java.util.Scanner;

public class Coconut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		int xa=sc.nextInt();
		int xb=sc.nextInt();
		int Xa=sc.nextInt();
		int Xb=sc.nextInt();
		int typeA=Xa/xa;
		int typeB=Xb/xb;
		int total=typeA+typeB;
		System.out.println(total);
		}
	}

}
