package checkedunchecked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("C:/Users/harip/Documents/Databa.docx");
		}catch(FileNotFoundException fnfe){
		
		System.out.println("The specified file is not " +
					"present at the given path");
		}

	}
}