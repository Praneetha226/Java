package learning;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.add(10);
		obj.add(11, 12);
	}
public void add(int c){
	System.out.println(c);
}
public void add(int d, int e){
	System.out.println(d + e);
}
}
