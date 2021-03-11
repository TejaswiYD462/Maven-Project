package utilities;

import java.util.Properties;

public class AccessProperties {
	
	static Properties prop=ReadPropertiesFile.readPropertiesFile();
	
	//Method to get the URL
	public static String getUrl()
	{
		return prop.getProperty("url");
	}
	
	//Method to get Chrome Browser Property
	public static String getChromeProperty() 
	{
		return prop.getProperty("chrome");
	}
	
	public static String getOperaProperty()
	{
		return prop.getProperty("opera");
	}
}




