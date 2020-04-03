package Regression.Test.Suite;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Atlas.Pages.BaseClass;
import Utility.httpConnection;


@Listeners(Utility.ListenersClass.class)
public class PingLinks extends BaseClass {

	@Test (priority = 1, description = "Login into webpage")
	public void loadCMSPage() {
		element.login(excel.readExcelSheet(0, 0, 0), excel.readExcelSheet(0, 0, 1));
		element.explicitwaithere(driver);
	}
	
	@Test (priority = 2 , description = "Verify if all the links on the webpage are working")
	public void verifyTheConnection() {
		httpConnection.checkConnection(driver);	 
	}
	
}
