package overLoading;

public class MethodOverLoading2 {

	public static void main(String[] args) {
		MethodOverLoading2 obj = new MethodOverLoading2();
		obj.sew(10);
		obj.sew1(11, 12);

	}
public void sew(int a){
	System.out.println("Trying to print this" + a);
}
public void sew1(int b, int d){
	System.out.println("Display of b and d" + b    +   d);
}
}
