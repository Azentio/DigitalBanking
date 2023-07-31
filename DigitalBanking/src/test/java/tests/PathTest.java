package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import helper.JavascriptHelper;
import helper.WaitHelper;

public class PathTest {
	public static void main(String args[]) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		WaitHelper waitHelper = new WaitHelper(driver);
		driver.manage().window().maximize();
		driver.get("https://imal.path-solutions.com:8543/omni_corporate_web_portal_omnichannel_qc_o19/#/omni-login");
		System.out.println("Website got launched");
		JavascriptHelper javascriptHelper =new JavascriptHelper(driver);
		
		for (int i = 0; i <= 2000; i++) {
			try {
				WebElement userName = (WebElement)javascriptHelper.executeScript("return document.querySelector('#ion-input_username_omni-login > input')");
			//	userName.click();
				userName.sendKeys("RAZIAA");
				break;
			} catch (Exception e) {
				if (i == 2000) {
					Assert.fail(e.getMessage());
				}
			}

		}
		WebElement password = (WebElement)javascriptHelper.executeScript("return document.querySelector('#ion-input_password_omni-login > input')");
	//	password.click();
		password.sendKeys("123");
		//Thread.sleep(10000);
		WebElement login = (WebElement) javascriptHelper.executeScript("return document.querySelector('#login_submit > ps-action-button > div > ion-button')");
		login.click();
		//javascriptHelper.executeScript("return document.querySelector('#login_submit > ps-action-button > div > ion-button').click()");
		

	}

}
