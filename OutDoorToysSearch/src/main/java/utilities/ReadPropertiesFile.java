package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static Properties readPropertiesFile() {

		// Making object of FileInputStream so as to read the data from ebayconfig.properties
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					"./src/test/resources/config.properties");
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}

		// Making object of Properties class
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;
	}

}
