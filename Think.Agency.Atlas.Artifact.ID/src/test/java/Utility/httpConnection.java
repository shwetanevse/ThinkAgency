package Utility;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class httpConnection {

	public static void checkConnection(WebDriver driver) {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are -->" + links.size());

		for (WebElement ele : links) {
			try {
				String linkurl = ele.getAttribute("href");
				URL url = new URL(linkurl);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setConnectTimeout(3000);
				connection.connect();
				if (connection.getResponseCode() == 200) {
					System.out.println(
							"Connection for URL --> " + linkurl + " successful  -->" + connection.getResponseMessage());
				} else if (connection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println("Connection for URL --> " + linkurl + " unsuccessful  -->"
							+ connection.getResponseMessage());
				}
			} catch (Exception e) {

				System.out.println(
						"Error in loading the link " + ele.getText() + " and error message is " + e.getMessage());
			}

		}

	}
}
