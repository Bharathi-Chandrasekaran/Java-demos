package JavaBasics;

public class primeornot {

	public static void main(String[] args) {
		int n,i;
		n=1;
		if (n==0 ||n==1) {
			System.out.println("neither prime nor composite");
		}else {
			for(i=2;i<=n/2;i++) {
				if(n%i==0) {
					System.out.println(n+" is not primr");
				break;
				}
			}
				 
		}
		
	}


}
