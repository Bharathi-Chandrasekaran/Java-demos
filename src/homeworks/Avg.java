package homeworks;


import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the name:");
	String name=s.next();
	System.out.print("Language marks:");
	int l=s.nextInt();
	System.out.println("Math marks:");
	int m=s.nextInt();
	System.out.println("Science marks:");
	int c=s.nextInt();
	System.out.println("Social marks:");
	int d=s.nextInt();
	int total=l+m+c+d;
	System.out.println("Total:"+total);
	System.out.println("Average:"+total/4);
	}
	
}