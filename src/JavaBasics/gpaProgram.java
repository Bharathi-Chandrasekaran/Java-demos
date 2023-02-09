package JavaBasics;

public class gpaProgram {
	
	public static void main(String [] a) {
		double m = 69;
		double g,n,p,s;
		
		if (m>100) {
			System.out.println("Your grade is wrong. Please speak to your teacher.");
		} else if (m<70) {
			System.out.println("Your GPA is 0");
		}else {
		n=100-m;
		p=n/10;
		s = 5.5;
		g=s-p;
		System.out.println("Your GPA is "+g);
	}

	}	
		
}
