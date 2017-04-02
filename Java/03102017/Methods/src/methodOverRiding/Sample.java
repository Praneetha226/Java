package methodOverRiding;

public class Sample {
public void disp(){
	System.out.println("This is a Parent Class");
}
class Test extends Sample{
	public void disp(){
		System.out.println("This is a Child Class");
	}
	public void main(String [] args){
		Sample obj = new Test();
		obj.disp();
		
	}
}
}