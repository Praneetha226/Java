package learning1;

public class TryCatch1 {

	public static void main(String[] args) {
		int num = 15;
			int num2 = 20;
			int num3 =0;
			try{
			int	result = num2/num3;
			System.out.println("Warning: Don't divide any number by zero");
			}
			catch(ArithmeticException e){
			System.out.println("ArithmeticException is thrown");
			}
System.out.println("Out of try-catch Block");
	}

}
