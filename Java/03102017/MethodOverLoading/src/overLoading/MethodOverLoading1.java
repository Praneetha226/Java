package overLoading;

public class MethodOverLoading1 {

	public static void main(String[] args) {
		MethodOverLoading1 obj = new MethodOverLoading1();
obj.disp(46);

obj.disp("Monster", 40);

	}
	public void disp(int c){
		System.out.println("This should display c" +  c);
	}
	public void disp(String d, int e){
		System.out.println("This should concatenate string 'd' and int 'e'" + d + e );
	}

}
