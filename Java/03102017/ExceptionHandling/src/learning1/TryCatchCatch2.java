package learning1;

public class TryCatchCatch2 {

	public static void main(String[] args) {
		int a[] = new int[4];
		try
		{
			a[1]= 21/0;
		System.out.println("Warning: Don't divide a number by zero");
		}
		catch(ArithmeticException e){
			System.out.println("Warning: Arithmetic Exception");
		}
			try{
				a[5]= 12/6;
				System.out.println("Warning: Index number should less than 5");
			}

		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Warning: Array size is larger than the array size we have");
		}
	}
	}

