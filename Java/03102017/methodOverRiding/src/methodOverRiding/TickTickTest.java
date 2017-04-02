package methodOverRiding;

public class TickTickTest {
	
	public static void main(String[] args){
		Sample2 s=new Sample2();
		System.out.println(s.getswetha(10));
		
		
	}
		
		int a;
		
		public int getswetha(int a){
			return a;
			
		}

	}
	class Sample2 extends TickTickTest{
		

		public int getswetha(int a){
			return a;
			
		}
		
		
	}

