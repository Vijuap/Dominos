package readProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadCommonProperties {
	 Properties prop = new Properties();
String url;
	public void loadFile() throws IOException {
		FileInputStream fis = new FileInputStream("C:/Users/anand/Maven.java/CommonProperties.properties");
		prop.load(fis);
		url=prop.getProperty("URL");
	}


	public  String getPropertyValue(String url) {
		this.url=url;
	return url;
	}

}