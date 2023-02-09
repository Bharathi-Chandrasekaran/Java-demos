package JavaBasics;

public class Sumofdigits {

	public static void main(String[] args) {
		int n=361;
		//System.out.println(n%10);
		int sum=0;
		while(n>0)
		{
			int x=n%10;
			n=n/10;
			sum=sum+x;
		}
		System.out.println(sum);

	}

}
