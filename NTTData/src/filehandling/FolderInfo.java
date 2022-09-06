package filehandling;

import java.io.File;
import java.io.FilenameFilter;

public class FolderInfo {

	public static void main(String[] args) {
		printDirectory("D:\\NTT\\Badminton");
	}
	public static boolean printDirectory(String path) {
		File file = new File(path);
		if(file.exists()) {
			System.out.println("File: " + file.getName());
			System.out.println("Absolute File path : "+ file.getAbsolutePath());
			System.out.println("Folder Path : " + file.getParent());
			File[] directories = new File("D:\\NTT\\Badminton").listFiles(File::isDirectory);
			for (int i = 0; i < directories.length; i++) {
				System.out.println("Directory :"+directories[i].getName());
				System.out.println("Path : " + directories[i].getPath());
			}
			
			return true;
		}
		else {
			System.out.println("No Folder exists with the given name");
			return false;
		}
	}
	

	
}
