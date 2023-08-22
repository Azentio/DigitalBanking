package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import dataProvider.DataReader;
import freemarker.template.utility.NullArgumentException;

public class UserUtility_614 {

	Actions action;
	JavascriptExecutor js;
	public HashMap<String, HashMap<String, String>> map = new HashMap<>();

	public UserUtility_614(WebDriver driver) {
		this.action = new Actions(driver);
		this.js = (JavascriptExecutor) driver;
	}

	public void waitHelper(WebDriver driver, String xpath) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(Integer.valueOf(DataReader.configFileMap.get("timeout"))))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void waitHelperClick(WebDriver driver, String xpath) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(Integer.valueOf(DataReader.configFileMap.get("timeout"))))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

	public void waitHelper_Js(WebDriver driver, String xpath) {
		
		int waitTime = Integer.valueOf(DataReader.configFileMap.get("timeout"));
		


		for (int i = 0; i < waitTime + 10 ; i++) {

			try {
				WebElement webElement = (WebElement) js.executeScript("return " + xpath + "");

				if (!webElement.equals(null)) {
					
					try {
						Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(Integer.valueOf(DataReader.configFileMap.get("timeout"))))
								.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

						wait.until(ExpectedConditions.elementToBeClickable(webElement));
					} catch (Exception e) {
						break;
					}
					
					break;
				} else {
					throw new NullArgumentException();
				}

			} catch (Exception e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}

	}
	
	public void waitHelper_Js(WebDriver driver, String xpath, int waitTime) {
		
		for (int i = 0; i < waitTime + 10 ; i++) {

			try {
				WebElement webElement = (WebElement) js.executeScript("return " + xpath + "");
				
				

				if (!webElement.equals(null)) {
					
					try {
						Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(Integer.valueOf(DataReader.configFileMap.get("timeout"))))
								.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

						wait.until(ExpectedConditions.elementToBeClickable(webElement));
					} catch (Exception e) {
						break;
					}
					
					break;
				} else {
					throw new NullArgumentException();
				}

			} catch (Exception e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

	public void waitHelper(WebDriver driver, String xpath, int waitTime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(waitTime))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void waitHelperClick(WebDriver driver, String xpath, int waitTime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(waitTime))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

	public void moveToElement(WebDriver driver, WebElement webElement) {

		action.moveToElement(webElement).perform();
	}

	public void clickOnElement(WebDriver driver, WebElement webElement) {

		js.executeScript("arguments[0].click();", webElement);
	}

	public void doubleClickOnElement(WebDriver driver, WebElement webElement) {

		action.doubleClick(webElement).perform();
	}
	
	public void doubleClickOnElement(WebDriver driver, String xpath, boolean JS) {

		WebElement webElement;

		if (JS) {
			waitHelper_Js(driver, xpath);
			webElement = (WebElement) js.executeScript("return " + xpath + "");
			doubleClickOnElement(driver, webElement);
		} else {
			waitHelperClick(driver, xpath);
			webElement = driver.findElement(By.xpath(xpath));
			moveToElement(driver, webElement);
			doubleClickOnElement(driver, webElement);
		}

	}

	public void clickOnElement(WebDriver driver, String xpath, boolean JS) {

		WebElement webElement;

		if (JS) {
			waitHelper_Js(driver, xpath);
			webElement = (WebElement) js.executeScript("return " + xpath + "");
			clickOnElement(driver, webElement);
		} else {
			waitHelperClick(driver, xpath);
			webElement = driver.findElement(By.xpath(xpath));
			moveToElement(driver, webElement);
			clickOnElement(driver, webElement);
		}

	}
	
	public void clickOnElementNoWait(WebDriver driver, String xpath, int waitTime, boolean JS) {

		WebElement webElement;

		if (JS) {
			waitHelper_Js(driver, xpath, waitTime);
			webElement = (WebElement) js.executeScript("return " + xpath + "");
			clickOnElement(driver, webElement);
		} else {
			waitHelperClick(driver, xpath, waitTime);
			webElement = driver.findElement(By.xpath(xpath));
			moveToElement(driver, webElement);
			clickOnElement(driver, webElement);
		}

	}

	public void enterData(WebDriver driver, String xpath, String value, boolean JS) {

		WebElement webElement;

		if (JS) {
			waitHelper_Js(driver, xpath);
			webElement = (WebElement) js.executeScript("return " + xpath + "");
//			moveToElement(driver, webElement);
			clickOnElement(driver, webElement);
			webElement.clear();
			webElement.sendKeys(value);
		} else {
			waitHelperClick(driver, xpath);
			webElement = driver.findElement(By.xpath(xpath));
			moveToElement(driver, webElement);
			clickOnElement(driver, webElement);
			webElement.clear();
			webElement.sendKeys(value);
		}

	}

	public void enterDataAndTab(WebDriver driver, String xpath, String value, boolean JS) {

		WebElement webElement;

		if (JS) {
			waitHelper_Js(driver, xpath);
			webElement = (WebElement) js.executeScript("return " + xpath + "");
//			moveToElement(driver, webElement);
			clickOnElement(driver, webElement);
			webElement.clear();
			webElement.sendKeys(value, Keys.TAB);
		} else {
			waitHelperClick(driver, xpath);
			webElement = driver.findElement(By.xpath(xpath));
			moveToElement(driver, webElement);
			clickOnElement(driver, webElement);
			webElement.clear();
			webElement.sendKeys(value, Keys.TAB);
		}

	}

	public void enterDataAndEnter(WebDriver driver, String xpath, String value, boolean JS) {

		WebElement webElement;

		if (JS) {
			waitHelper_Js(driver, xpath);
			webElement = (WebElement) js.executeScript("return " + xpath + "");
			clickOnElement(driver, webElement);
			webElement.clear();
			webElement.sendKeys(value);
			webElement.sendKeys(Keys.ENTER);
		} else {
			waitHelperClick(driver, xpath);
			webElement = driver.findElement(By.xpath(xpath));
			moveToElement(driver, webElement);
			clickOnElement(driver, webElement);
			webElement.clear();
			webElement.sendKeys(value);
			webElement.sendKeys(Keys.ENTER);
		}

	}

	public String getText(WebDriver driver, String xpath, boolean JS) {

		WebElement webElement;

		if (JS) {
			waitHelper_Js(driver, xpath);
			webElement = (WebElement) js.executeScript("return " + xpath + "");
			return webElement.getText();
		} else {
			waitHelper(driver, xpath);
			webElement = driver.findElement(By.xpath(xpath));
			moveToElement(driver, webElement);
			return webElement.getText();
		}

	}

	public boolean getTextAndValidationByAnotherText(WebDriver driver, String xpath, String value, boolean JS) {

		WebElement webElement;
		String currentValue;

		if (JS) {
			waitHelper_Js(driver, xpath);
			webElement = (WebElement) js.executeScript("return " + xpath + "");
			currentValue = webElement.getText();

		} else {
			waitHelper(driver, xpath);
			webElement = driver.findElement(By.xpath(xpath));
			moveToElement(driver, webElement);
			currentValue = webElement.getText();
		}

		if (currentValue.equals(value)) {
			return true;
		}

		else {
			return false;
		}

	}

	public boolean getTextAndValidationByAnotherWebElementText(WebDriver driver, String xpath1, String xpath2,
			boolean JS) {

		WebElement webElement;
		String currentValue;
		String compareableValue;

		if (JS) {
			waitHelper_Js(driver, xpath1);
			webElement = (WebElement) js.executeScript("return " + xpath1 + "");
			currentValue = webElement.getText();

			waitHelper_Js(driver, xpath2);
			webElement = (WebElement) js.executeScript("return " + xpath2 + "");
			compareableValue = webElement.getText();

		} else {
			waitHelper(driver, xpath1);
			webElement = driver.findElement(By.xpath(xpath1));
			moveToElement(driver, webElement);
			currentValue = webElement.getText();

			waitHelper(driver, xpath2);
			webElement = driver.findElement(By.xpath(xpath2));
			moveToElement(driver, webElement);
			compareableValue = webElement.getText();
		}

		if (currentValue.equals(compareableValue)) {
			return true;
		}

		else {
			return false;
		}

	}

	/***
	 * 
	 * @return - The current date of the system running date.
	 */

	public String currentDate() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate currentDate = LocalDate.now();
		String date = dtf.format(currentDate);
		return date;
	}

	/***
	 * 
	 * @return - The previous date of the system current running date.
	 */

	public String previousDate() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate currentDate = LocalDate.now();
		LocalDate yesterdayDate = currentDate.minusDays(1);
		String date = dtf.format(yesterdayDate);
		return date;
	}

	public void scrollUp(WebDriver driver, WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	}

	public void scrollDownByPixel(WebDriver driver, String pixel1, String pixel2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + pixel1 + "," + pixel2 + ")");
	}

	public void scrollDownTillElement(WebDriver driver, WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webElement);
	}

	public void scrollDownTillEnd(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollHorizontally(WebDriver driver, WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webElement);
	}

	public void moveTheCursortoLocation(int xOffset, int yOffset) {
		action.moveByOffset(xOffset, yOffset);
	}
	
	public boolean checkHolidays() {
		
		String[] holidays = {"FRIDAY","SATURDAY","SUNDAY"};
		List<String> holidayList = Arrays.asList(holidays);
		String currentDay = LocalDate.now().getDayOfWeek().toString();
		boolean holiday = false;
		if (holidayList.contains(currentDay)) {
			holiday = true;
		}
		
		return holiday;
	}
	
	public static void openWriteAndCloseInExcel(String filePath, String sheetName, int rowNo, int colNo, String value) {

		File file = new File(filePath);
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Workbook wb = null;
		try {
			wb = new XSSFWorkbook(fileInputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}

		XSSFSheet sheet = (XSSFSheet) wb.getSheet(sheetName);

		XSSFRow row = sheet.getRow(rowNo);
		XSSFCell cell = row.getCell(colNo);
		cell.setCellValue(value);

		FileOutputStream outstream = null;
		try {
			outstream = new FileOutputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			wb.write(outstream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			outstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void selectFromDropdown(WebDriver driver, String xpath, String selectText) {
		WebElement webElement;
		waitHelper(driver, xpath);
		webElement = driver.findElement(By.xpath(xpath));
		moveToElement(driver, webElement);
		
		Select objSelect = new Select(webElement);
		objSelect.selectByVisibleText(selectText);
	}
	
	/***
	 * 
	 * @param seleniumActions
	 * @param driver
	 * @param webElement
	 * 
	 * @author Double clicks on the element
	 */

	public int getNumberOfElements(WebDriver driver, String xpath) {
		
		List<WebElement> findElements = null;
		int size = 0;
		
		try {
			Thread.sleep(10000);
			waitHelper(driver, xpath);
			findElements = driver.findElements(By.xpath(xpath));
			size = findElements.size();
			System.out.println(size);
		}
		catch (Exception e) {
			e.printStackTrace();
			size = 1;
		}
		
		System.out.println(size);
		return size;
	}
	
	public boolean elementIsEnabled(WebDriver driver, String xpath) {
		
		WebElement webElement;
		waitHelper(driver, xpath);
		webElement = driver.findElement(By.xpath(xpath));
		moveToElement(driver, webElement);
		
		boolean enabled = webElement.isEnabled();
		return enabled;
	
	}
//	

//	
	public boolean elementIsSelected(WebDriver driver, String xpath) {

		WebElement webElement;
		waitHelper(driver, xpath);
		webElement = driver.findElement(By.xpath(xpath));
		moveToElement(driver, webElement);
		boolean enabled = webElement.isSelected();
		return enabled;
	}
	
	public boolean elementIsVisible(WebDriver driver, String xpath) {

		WebElement webElement;
		
		waitHelper(driver, xpath);
		webElement = driver.findElement(By.xpath(xpath));
		moveToElement(driver, webElement);
		boolean enabled = webElement.isDisplayed();
		return enabled;
	}

	public void waitForElementwithFluentwait(WebDriver driver, String xpath, long waitTime) 
	{ 	
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(waitTime)) 
				.pollingEvery(Duration.ofMillis(2))
				.ignoring(Exception.class);
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void checkAndDeleteRecord( WebDriver driver, int offset, String Xpathlocator, String deleteButton, String okButton) {
		try {
			for (int i = offset; i < getNumberOfElements( driver, Xpathlocator)+1; i++) {
				driver.findElement(By.xpath(Xpathlocator + "["+offset+"]")).click();
				WebElement deleteButtonWebElement = driver.findElement(By.xpath(deleteButton));
				WebElement okButtonWebElement = driver.findElement(By.xpath(okButton));
				clickOnElement(driver, deleteButtonWebElement);
				clickOnElement( driver, okButtonWebElement);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String textReplacer(String xpath, String textChange, String newValue) {
		String newXpath = xpath.replace(textChange, newValue);
		return newXpath;
	}
	

}