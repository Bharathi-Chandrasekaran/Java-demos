package JavaBasics;


public class armstrongnumber {

	static public void main(String[] args) {
		int count;
		long s,n,temp,org;
		double ans;
		ans=0;
		s=407L;
		temp=s;
		org=s;
		count=0;
		while (s>0) {
			s=s/10;
			count++;
		}
	/*if (count>1) {
		System.out.println("There are "+count+" digits.");
	} else {
		System.out.println("There is "+count+" digit.");
	}*/
	while (temp>0) {
		n=temp%10;
		ans=ans+Math.pow(n,count);
		temp=temp/10;
		
	}
	if(ans==org) {
		System.out.println(org+" is an armstrong number!!");
	}else
		System.out.println(org+" is not an armstrong number");
	}
	}

