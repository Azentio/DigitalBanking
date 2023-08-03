package utilities;

import java.time.Duration;
import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import dataProvider.DataReader;

public class UserUtility_614 {
	
	Actions action;
	JavascriptExecutor js;
	public HashMap<String, HashMap<String, String>> map = new HashMap<>();
	
	public UserUtility_614(WebDriver driver) {
		this.action = new Actions(driver);
		this.js = (JavascriptExecutor) driver;
	}
	
	
	public void waitHelper(WebDriver driver, String xpath) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(Integer.valueOf(DataReader.configFileMap.get("timeout"))))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void waitHelper_Js(WebDriver driver, String xpath) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(Integer.valueOf(DataReader.configFileMap.get("timeout"))))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOf((WebElement)js.executeScript("return document.querySelector('"+xpath+"')")));
	}
	
	public void waitHelper(WebDriver driver, String xpath, int waitTime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(waitTime))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	
	public void moveToElement(WebDriver driver, WebElement webElement) {

		action.moveToElement(webElement).perform();
	}
	
	public void clickOnElement(WebDriver driver, WebElement webElement) {

		webElement.click();
	}
	
	public void clickOnElement(WebDriver driver, String xpath, boolean JS) {
	        
			WebElement webElement;
			
			if (JS) {
				waitHelper_Js(driver, xpath);
				webElement = (WebElement)js.executeScript("return document.querySelector('"+xpath+"')");
			}
			
			waitHelper(driver, xpath);
			webElement = driver.findElement(By.xpath(xpath));
			moveToElement(driver, webElement);
			clickOnElement(driver, webElement);
	}
	
	
	public void enterDataAndTab(WebDriver driver, String xpath, String value, boolean JS) {
        
		WebElement webElement;
		
		if (JS) {
			webElement = (WebElement)js.executeScript("return document.querySelector('"+xpath+"')");
			waitHelper_Js(driver, xpath);
		}
		
		waitHelper(driver, xpath);
		webElement = driver.findElement(By.xpath(xpath));
		moveToElement(driver, webElement);
		clickOnElement(driver, webElement);
		webElement.clear();
		webElement.sendKeys(value, Keys.TAB);
	}

	public void enterDataAndEnter(WebDriver driver, String xpath, String value, boolean JS) {

		WebElement webElement;

		if (JS) {
			webElement = (WebElement)js.executeScript("return document.querySelector('"+xpath+"')");
			waitHelper_Js(driver, xpath);
		}

		waitHelper(driver, xpath);
		webElement = driver.findElement(By.xpath(xpath));
		moveToElement(driver, webElement);
		clickOnElement(driver, webElement);
		webElement.clear();
		webElement.sendKeys(value, Keys.ENTER);
	}
	
//	public String getText(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		return webElement.getText();
//	}
//	
//	public boolean getTextAndValidationByAnotherText(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement, String value) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		String currentValue =  webElement.getText();
//		
//		if (currentValue.equals(value)) {
//			return true;
//		}
//		
//		else {
//			return false;
//		}
//	}
//	
//	public boolean getTextAndValidationByAnotherWebElementText(Selenium_Actions seleniumActions, WebDriver driver, WebElement CurrentwebElement, WebElement ComparewebElement) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ComparewebElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(ComparewebElement);
//		String value =  ComparewebElement.getText();
//		
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, ComparewebElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(ComparewebElement);
//		String currentValue =  ComparewebElement.getText();
//		
//		if (currentValue.equals(value)) {
//			return true;
//		}
//		
//		else {
//			return false;
//		}
//	}
//	
//
//	public void enterAccountDetailsForFirstAccountInTransaction() {
//
//	}
//	
//	/***
//	 * 
//	 * @return - The current date of the system running date.
//	 */
//
//	public String currentDate() {
//
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate currentDate = LocalDate.now();
//		String date = dtf.format(currentDate);
//		return date;
//	}
//	
//	/***
//	 * 
//	 * @return - The previous date of the system current running date.
//	 */
//
//	public String previousDate() {
//
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate currentDate = LocalDate.now();
//		LocalDate yesterdayDate = currentDate.minusDays(1);
//		String date = dtf.format(yesterdayDate);
//		return date;
//	}
//
//	public void clickOnElement(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		seleniumActions.getClickAndActionsHelper().clickOnElement(webElement);
//	}
//
//	public void clickOnElement1(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		webElement.click();
//	}
//	
//	public void selectFromDropdown(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement, String selectText) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		
//		Select objSelect = new Select(webElement);
//		objSelect.selectByVisibleText(selectText);
//		
//	}
//	
//	/***
//	 * 
//	 * @param seleniumActions
//	 * @param driver
//	 * @param webElement
//	 * 
//	 * @author Double clicks on the element
//	 */
//
//	public void doubleClickOnElement(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		seleniumActions.getClickAndActionsHelper().doubleClick(webElement);
//	}
//	
//	public int getNumberOfElements(Selenium_Actions seleniumActions, WebDriver driver, String Xpathlocator) {
//		
//		List<WebElement> findElements = null;
//		int size = 0;
//		
//		try {
//			Thread.sleep(10000);
//			findElements = driver.findElements(By.xpath(Xpathlocator));
//			size = findElements.size();
//			System.out.println(size);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			size = 1;
//		}
//		System.out.println(size);
//		return size;
//	}
//	
//	public void checkAndDeleteRecord(Selenium_Actions seleniumActions, WebDriver driver, int offset, String Xpathlocator, WebElement deleteButton, WebElement okButton) {
//		try {
//			for (int i = offset; i < getNumberOfElements(seleniumActions, driver, Xpathlocator)+1; i++) {
//				driver.findElement(By.xpath(Xpathlocator + "[2]")).click();
//				clickOnElement(seleniumActions, driver, deleteButton);
//				clickOnElement(seleniumActions, driver, okButton);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	/***
//	 * @return 
//	 * @see The constructor will load the excel data into a hashMap for the given URL path of the excel file
//	 */
//
//	public HashMap<String,HashMap<String,String>> getExcelDataUserUtility_614() {
//
//		String path = System.getProperty("user.dir") + "/TestData/CSMTestData.xlsx";
//
//		File file = null;
//		
//		try
//		{
//			file = new File(path);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//
//		XSSFWorkbook dataBook = null;
//		try {
//			try {
//				dataBook = new XSSFWorkbook(file);
//			} catch (org.apache.poi.openxml4j.exceptions.InvalidFormatException e) {
//				e.printStackTrace();
//			}
//		} 
//		catch (InvalidFormatException e) {
//			e.printStackTrace();
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		XSSFSheet dataSheet = dataBook.getSheet("Transaction_614");
//
//		int noOfRows = dataSheet.getPhysicalNumberOfRows();
//		int noOfCols = dataSheet.getRow(0).getLastCellNum();
//		for(int i = 1;i<noOfRows;i++){
//
//			XSSFRow row = dataSheet.getRow(i);
//			
//			Cell titleCell = row.getCell(0);
//			DataFormatter formatter = new DataFormatter();
//			String titleHeader = formatter.formatCellValue(titleCell);
//			HashMap<String, String> map1 = new HashMap<>();
//
//			for (int j = 1; j < noOfCols; j++) {
//
//				XSSFRow headerRow = dataSheet.getRow(0);
//				XSSFCell headerCell = headerRow.getCell(j);
//				String headerValue = formatter.formatCellValue(headerCell);
//
//				Cell cell = row.getCell(j);
//				String value = formatter.formatCellValue(cell);
//
//				map1.put(headerValue, value);
//			}
//
//			map.put(titleHeader, map1);
//			
////			System.out.println(map);
//			
//			try {
//				try {
//					dataBook.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return map;
//
//	}
//	
////	/***
////	 * 
////	 * @param testCaseID
////	 * @param requiredColumnName
////	 * @return The String value of the required parameter
////	 */
//	
//	public String getExcelData(String testCaseID, String requiredColumnName) {
//		
//		String value = getExcelDataUserUtility_614().get(testCaseID).get(requiredColumnName);
//		System.out.println(value);
//		return value;
//		
//	}
//	
//	public boolean elementIsEnabled(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		boolean enabled = webElement.isEnabled();
//		return enabled;
//	}
//	
//	public void scrollUp(WebDriver driver, WebElement webElement) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	}
//	
//	public void scrollDownByPixel(WebDriver driver, String pixel1, String pixel2) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy("+pixel1+","+pixel2+")");
//	}
//	
//	public void scrollDownTillElement(WebDriver driver, WebElement webElement) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", webElement);
//	}
//	
//	public void scrollDownTillEnd(WebDriver driver) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	}
//	
//	public void scrollHorizontally(WebDriver driver, WebElement webElement) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", webElement);
//	}
//	
//	public void moveTheCursortoLocation(int xOffset, int yOffset  ) {
//		action.moveByOffset(xOffset, yOffset);
//	}
//	
//	public boolean elementIsSelected(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		boolean enabled = webElement.isSelected();
//		return enabled;
//	}
//	
//	public boolean elementIsVisible(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		boolean enabled = webElement.isDisplayed();
//		return enabled;
//	}
//	
//	public void sendKeys(Selenium_Actions seleniumActions, WebDriver driver, WebElement webElement, String data) {
//
//		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, webElement);
//		seleniumActions.getClickAndActionsHelper().moveToElement(webElement);
//		webElement.sendKeys(data);
//	}
//	
//	public boolean checkHolidays() {
//		
//		String[] holidays = {"FRIDAY","SATURDAY","SUNDAY"};
//		List<String> holidayList = Arrays.asList(holidays);
//		String currentDay = LocalDate.now().getDayOfWeek().toString();
//		boolean holiday = false;
//		if (holidayList.contains(currentDay)) {
//			holiday = true;
//		}
//		
//		return holiday;
//	}
//	
//	public void waitForElementwithFluentwait(WebDriver driver, WebElement element, long waitTime) 
//	{ 	
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(waitTime)) 
//				.pollingEvery(Duration.ofMillis(2))
//				.ignoring(Exception.class);
////		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
//		WebElement element1 = wait.until(ExpectedConditions.visibilityOf(element));
//	}
//	
//public static void openWriteAndCloseInExcel(String filePath, String sheetName, int rowNo, int colNo, String value) {
//		
//		File file = new File(filePath);
//		FileInputStream fileInputStream = null;
//		
//		try {
//			fileInputStream = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		Workbook wb = null;
//		try {
//			wb = new XSSFWorkbook(fileInputStream);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		XSSFSheet sheet = (XSSFSheet) wb.getSheet(sheetName);
//		
//		
//		
//		XSSFRow row = sheet.getRow(rowNo);
//		XSSFCell cell = row.getCell(colNo);
//		cell.setCellValue(value);
//		
//		FileOutputStream outstream = null;
//		try {
//			outstream = new FileOutputStream(file);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			wb.write(outstream);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		try {
//			outstream.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		try {
//			wb.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}