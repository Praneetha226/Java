package constructorOverLoading;

public class ConstructorChaining {
	
	public ConstructorChaining(){
	System.out.println("Default Constructor");	
	}
public ConstructorChaining(String str){
	this();
	System.out.println("Constructor with single parameter");
}
public ConstructorChaining(String str, int num){
	this("Hello");
	System.out.println("Constructor with double parameters");
}
public ConstructorChaining(int num1, int num2, int num3){
	this("Hello",2);
	System.out.println("Constructor with Three parameters");
}
public ConstructorChaining(double d, int i, String string) {
	this(11,12,13);
	System.out.println("Finally!!!!!!!!!");
}
public static void main(String [] args){
	ConstructorChaining obj = new ConstructorChaining(4.2, 2, "SWETHA");
}
}