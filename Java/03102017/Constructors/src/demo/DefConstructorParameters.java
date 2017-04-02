package demo;

public class DefConstructorParameters {
	
	      private int var;
	      public DefConstructorParameters()
	      {
	             //code for default one
	             var = 10;
	      }
	      public DefConstructorParameters(int num)
	      {
	             //code for parameterized one
	             var = num;
	      }
	      public int getValue()
	      {
	              return var;
	      }
	      public static void main(String args[])
	      {
	              DefConstructorParameters obj2 = new DefConstructorParameters();
	              System.out.println("var is: "+obj2.getValue());
	      }
	}
