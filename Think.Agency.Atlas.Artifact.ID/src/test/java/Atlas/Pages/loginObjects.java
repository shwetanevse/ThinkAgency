package Atlas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginObjects {
	WebDriver driver;
	
	public loginObjects(WebDriver driver) {
		driver = this.driver;
	}
	
	@FindBy(how = How.ID, using = "username")
	WebElement username;
	
	@FindBy(how = How.ID, using = "password")
	WebElement password;
	
	@FindBy (how = How.ID, using = "submitButton")
	WebElement submitButton;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	WebElement logoutButton;
	
	public void login(String id, String pass) {
		username.sendKeys(id);
		password.sendKeys(pass);
		submitButton.click();		
	}
	
	public void explicitwaithere(WebDriver webdriver) {
		WebDriverWait wait = new WebDriverWait(webdriver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
	}
}
