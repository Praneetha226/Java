package overRiding;

public class MethodOverRiding1 {
	public static void main(String[] args) {
		Rider obj = new Rider();
		obj.disp();
	}
	public void disp(){
		System.out.println("I have no idea, what's happening");
	}}
class Rider extends MethodOverRiding1{
		public void disp(){
			System.out.println("This is extracted from Parent Class");
		}
	}
	

