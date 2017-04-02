package prgrms;

import java.io.File;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File fileObject = new File("‪C:/Users/harip/Desktop/NayaFolder");
		/*fileObject.mkdirs();*/
	
		boolean a = fileObject.exists();
		if (a == true){
			System.out.println("Folder Exists");
			}
			else {
			System.out.println("Folder Not Exists");
			}
	}

}
