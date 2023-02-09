package JavaBasics;

public class SecondsConversion {

	public static void main(String[] args) {
	int s=20000;
	int hr=s/3600;
	int x=s%3600;
	int min=x/60;
	int sec=s%60;
	System.out.println(hr+"hours "+min+"minutes "+sec+" Seconds");
	
}
}