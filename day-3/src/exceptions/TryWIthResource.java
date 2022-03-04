package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWIthResource {

	public static void main(String[] args) {
		/*FileInputStream fis = null;
		try {
			fis = new FileInputStream("sample.txt");
			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found..");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		
		
		try(FileInputStream fis = new FileInputStream("sample.txt");) {
			
			int b = 0;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found..");
		} catch (IOException e) {
			System.out.println(e);
		} 


	}

}
