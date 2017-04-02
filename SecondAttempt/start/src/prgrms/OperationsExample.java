package prgrms;

public class OperationsExample {
static	int a = 40;
static	int b = 20;
static int c = 30;

	public static void main(String[] args) {
		
		/*System.out.println(a+b);
		System.out.println(c-a);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);*/
		
		/*if(a>b){
			System.out.println("A is Bigger number");
		}
		else{
			System.out.println("B is large number");
		}*/
		
		if((a<b)||(b>c)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		int a= 40;
		System.out.println(a);
		a+= 10;
		System.out.println(a);
		
		int b= 30;
		System.out.println(b);
		b-= 10;
		System.out.println(b);
		
		
	}
}
