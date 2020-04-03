package Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class takescreenshot {
	
	public static void takescreenshotonfail(WebDriver driver, String testcasename) {
		File srcforscreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./ScreenShot/" +testcasename + ".png");
		try {
			FileUtils.copyFile(srcforscreen, dest);
		} catch (Exception e) {
			System.out.println("**Error is taking screenshot " +e.getMessage());
		}
		System.out.println("Screen shot taken successfully");
		}
		
	}


