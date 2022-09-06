package project_amazon_group_01.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	private Properties prop;
	private FileReader file = null;

	public PropertiesReader() {
		prop = new Properties();
		String fileLocation = PathProvider.getPropertiesFilelocation();
		try {
			file = new FileReader(fileLocation);
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getBrowserName() {
		return (String) prop.get("browser");
	}

	public String getAppURL() {
		return (String) prop.get("urlAMAZON");
	}


	public int getImplicitWait() {
		return Integer.parseInt((String) prop.get("implicitwait"));
	}
	
	public int getHardWait() {
		return Integer.parseInt((String) prop.get("hardwait"));
	}
}
