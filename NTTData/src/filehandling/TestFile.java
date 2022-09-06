package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {
	
	public static void main(String[] args) throws IOException {
//		File file=new File("D:\\NTT");
//		file.mkdir();
//		File file1 = new File("D:NTT\\Badminton");
//		file1.mkdir();
		File file2 = new File("D:\\NTT\\Badminton\\singles.txt");
//		FileWriter fw2 = new FileWriter(file2);
//		File file3 = new File("D:\\NTT\\Badminton\\dubbles.txt");
//		FileWriter fw3 = new FileWriter(file3);
//
//		File file4 = new File("D:\\NTT\\Badminton\\courts");
//		file4.mkdir();
//		// FileWriter fw3= new FileWriter(file4);
//
//		File file5 = new File("D:\\NTT\\Badminton\\courts\\smash.dat");
//		FileWriter fw5 = new FileWriter(file5);

//		File file6 = new File("D:\\NTT\\Badminton\\doubles.txt");
//		file3.renameTo(file6);
		
		file2.delete();
	}

}
