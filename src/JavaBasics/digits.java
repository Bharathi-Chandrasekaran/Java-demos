package JavaBasics;

public class digits {

	public static void main(String[] args) {
		int count;
		long s;
		s=45567888798567L;
		count=0;
		while (s>0) {
			s=s/10;
			count++;
		}
	if (count>1) {
		System.out.println("There are "+count+" digits.");
	} else {
		System.out.println("There is "+count+" digit.");
	}
	}
	
	


}
