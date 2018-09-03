package tyss01;

import java.util.Scanner;

public class inputfromkeybord {
	
	public static void main(String[] args) {
		
		int a,b,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two number:");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("sum is"+c);
		
	}

}
