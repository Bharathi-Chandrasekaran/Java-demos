package JavaBasics;

public class ananyaProgram {

	public static void main(String[] args) {
		int sum=0,i;
		
		for(i=0;i<5;i+=1) {
			System.out.print(i+" + ");
			sum=sum+i;
		}
		System.out.println("= "+sum);
	}

}
