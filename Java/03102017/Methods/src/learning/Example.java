package learning;

public class Example {

	public static void main(String[] args) {
		Example obj = new Example();
		obj.tobe("Hey");
		obj.tobe("It's", 140);
	

	}
public void tobe(String C){
	System.out.println(C);
}
public void tobe(String D, int E){
	System.out.println("What are you up to ? " + D + E);
}
}
