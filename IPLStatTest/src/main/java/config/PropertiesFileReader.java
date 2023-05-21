package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReader implements ConfigReader {
	private Properties properties;

	public PropertiesFileReader() {
		properties = new Properties();
		try {
			// Load the properties from the input stream
			properties.load(new FileInputStream(System.getProperty("user.dir") + "/config/config.properties"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		// Retrieve the value of the "url" property from the properties object
		return properties.getProperty("url");
	}

	public String getBrowser() {
		// Retrieve the value of the "browser" property from the properties object
		return properties.getProperty("browser");
	}
}
