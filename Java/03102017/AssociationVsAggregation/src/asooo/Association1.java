package asooo;
public class Association1 {
	 public static void main(String[] args) {
			
			/*Address obj = new Address(118, "Carrollton", 75006, "Texas");
				System.out.println(obj.streetnumber);
				System.out.println(obj.city);
				System.out.println(obj.zipcode);
				System.out.println(obj.State);*/
			
			//Address obj2 = new Address(118, "Carrollton", 75006, "Texas");
		    Address obj = new Address(118, "Carrollton", 75006, "Texas");
			Studentdetails obj1 = new Studentdetails(52, "Swetha", obj);
			
			System.out.println(obj1.StudentAddress);
			System.out.println(obj1.StudentAddress.streetnumber);
			System.out.println(obj1.StudentAddress.city);
			System.out.println(obj1.StudentAddress.zipcode);
			System.out.println(obj1.StudentAddress.State);
			System.out.println(obj1.StudentId);
			System.out.println(obj1.StudentName);
		
			}
	
}
 class Address{
int streetnumber;
String city;
int zipcode;
String State;

Address(int strnum, String str, int num1, String str1){
	 this.streetnumber=strnum;
	 this.city=str;
	 this.zipcode=num1;
	 this.State=str1;
}
}
 class Studentdetails{
	 int StudentId;
	 String StudentName;
	 Address StudentAddress;
	 
	 Studentdetails(int stid, String stname, Address adr){
		 this.StudentId=stid;
		 this.StudentName=stname;
		 this.StudentAddress=adr;
	 }
	
 }
 
	