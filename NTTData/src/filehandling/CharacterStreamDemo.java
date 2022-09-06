package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
	

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Chetan\\New_file.txt");
		FileWriter fw = new FileWriter(file);

		fw.write("Pacchu");
		
		
		FileReader fr = new FileReader(file);
		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);

		}

	}
}
