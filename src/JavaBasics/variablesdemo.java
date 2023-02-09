package JavaBasics;


public class variablesdemo {
	
	public static void main(String[] a) {
	
		
		int eng=100,math=89,sci=100,social=100;
		int sum=eng+math+sci+social;
		double avg=(sum/4);
		System.out.print("the total is " +sum+". ");
	System.out.print("the avg is "+avg+". ");
	if(avg>=90) {
		System.out.println("Distinction!!");
	}
	else if(/*avg<=90 &&*/ avg>=70) {

	System.out.println("first class");
	
	}
	else if(/*avg<=70 &&*/ avg>=40) {
		System.out.println("second class");
	}
	else {
		System.out.println("failed");
	}
	
	}
	
}



