package JavaBasics;

public class PalindromeNo {

	public static void main(String[] args) {
		int n=9998;
		int y=n;
		int sum=0;
		while(n>0)
		{
			int x=n%10;
			sum=sum*10+x;
			n=n/10;
		}
		System.out.println(sum);
		
		if(y==sum)
			
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
			
		}
	}
	

}
