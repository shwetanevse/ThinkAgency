package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class LoadPropertyFile {
	Properties pro;

	public LoadPropertyFile() {

		try {
			File src = new File("./Configuration/configuration.property");
			FileInputStream fin = new FileInputStream(src);
			pro = new Properties();
			pro.load(fin);
		} catch (Exception e)
		{
			System.out.println("****Error in loading file at 'LoadPropertyFile' class****" + e.getMessage());
		}
	}

	public String getKeyValue(String key) {
		return pro.getProperty(key);
	}

}
