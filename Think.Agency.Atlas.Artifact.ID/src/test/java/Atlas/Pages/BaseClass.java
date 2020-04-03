package Atlas.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import Utility.BrowserFactory;
import Utility.LoadExcel;
import Utility.LoadPropertyFile;


public class BaseClass {
	public LoadExcel excel;
	public LoadPropertyFile proFile;
	public WebDriver driver;
	public loginObjects element;
	

	@BeforeSuite
	public void loadFiles() {
		excel = new LoadExcel();
		proFile = new LoadPropertyFile();
	}

	@BeforeClass
	public void launchBrowserr() {
		driver = BrowserFactory.LaunchBrowser(driver, proFile.getKeyValue("Browser"), proFile.getKeyValue("URL"));
		element = PageFactory.initElements(driver, loginObjects.class);	
	}	
	
	@AfterClass
	public void tearDown() {	
		driver.close();
	}	
	
	@AfterMethod
	public void takescreenshot(ITestResult result) {
		if (ITestResult.FAILURE==result.getStatus()) {
			Utility.takescreenshot.takescreenshotonfail(driver, result.getName());
		}
		
	}
	
}
