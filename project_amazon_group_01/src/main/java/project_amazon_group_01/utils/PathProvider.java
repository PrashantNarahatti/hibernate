package project_amazon_group_01.utils;

public class PathProvider {
	private static String getBasepath() {
		return System.getProperty("user.dir");
	}

	public static String getPropertiesFilelocation() {
		return getBasepath() + "/src/main/resources/config.properties";
	}
}