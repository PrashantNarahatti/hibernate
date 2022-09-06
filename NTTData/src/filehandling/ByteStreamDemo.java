package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		
		final String path="D:\\Chetan\\New_file1.txt";
		String str="Hello How are you?";
		
		File file=new File(path);
//		
		
//		if(file.createNewFile()) {
//			System.out.println("File created");
//		}
//		else {
		
//			System.out.println("could not create file");
//		}
		FileOutputStream fos=new FileOutputStream(file);
		byte[] bytes=str.getBytes();
		fos.write(65);
		fos.write(bytes);
		
		FileInputStream fis=new FileInputStream(file);
		//int i=fis.read();
		//System.out.println(i);
		
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
	

}
