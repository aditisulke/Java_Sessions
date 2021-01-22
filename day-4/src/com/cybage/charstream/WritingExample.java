package com.cybage.charstream;
import java.io.FileWriter;
public class WritingExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter writer=null;
		String data="I want to write data using file writer";
		
		writer=new FileWriter("charstream.txt");
		writer.write(data);
		
		writer.close();
	}

}
