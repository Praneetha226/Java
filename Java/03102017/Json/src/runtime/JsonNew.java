package runtime;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonNew {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
System.out.println("Enter Student name");
String Name = S.nextLine();

System.out.println("Enter student CourseName");
String CourseName = S.nextLine();

System.out.println("Enter grade");
int grade = S.nextInt();


// create new JSON object
JSONObject root = new JSONObject();
//put the name name-value pair
root.put("name", Name);

//create a JSON object and Array and store the class object in it
JSONObject CourseObject1 = new JSONObject();
CourseObject1.put("grade", grade);
CourseObject1.put("name", CourseName);

JSONArray Courses = new JSONArray();
Courses.add(CourseObject1);

//add CourseObject to root folder
root.put("Courses", Courses);
 System.out.println(root.toJSONString());

	}
}
