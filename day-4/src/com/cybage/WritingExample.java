package com.cybage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream output=null;
		String data="i want to write this file";
		
		try {
			output=new FileOutputStream("myfile.txt",true);
			output.write(data.getBytes());
		
		}catch(FileNotFoundException fe) {
			System.out.print(fe.getMessage());
		
		}catch(IOException ioe) {
			System.out.print(ioe.getMessage());
		
		}finally {
			output.close();
		}
		
	}

}
