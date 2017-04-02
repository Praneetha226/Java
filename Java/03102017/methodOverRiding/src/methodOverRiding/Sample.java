package methodOverRiding;

public class Sample {
	public static void main(String[] args){
		Sample1 s=new Sample1();
		System.out.println(s.getswetha(50));
		
		
	}
	
	int a;
	
	public int getswetha(int a){
		return a;
		
	}

}
class Sample1 extends Sample{
	

	public int getswetha(int a){
		return a;
		
	}
	
	
}

