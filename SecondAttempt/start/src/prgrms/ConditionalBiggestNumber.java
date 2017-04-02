package prgrms;

public class ConditionalBiggestNumber {

	public static void main(String[] args) {
		int a,b,c,d;
		a=20;b=25;c=15;d=13;
		if((a>b)&&(a>c)&&(a>d)){
			System.out.println("A is the biggest number");
		}else if((b>a)&&(b>c)&&(b>d)){
			System.out.println("B is the biggest number");
		}
		else if((c>a)&&(c>b)&&(c>d)){
			System.out.println("C is the biggest number");
		}
		else{
			System.out.println("D is the biggest number");
		}

	}

}
