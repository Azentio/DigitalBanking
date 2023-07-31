package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_CardsManagementObj {
	WebDriver driver;

	public CSM_CardsManagementObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Cards Management']")
	private WebElement csm_CardsManagementFeature;

	public WebElement csmCrdsManagementFeature() {
		return csm_CardsManagementFeature;
	}

	@FindBy(xpath = "//input[@name='ACC_CIF']")
	private WebElement cardsManagement_InputCIFNumber;

	public WebElement cardsManagementInputCIFNumber() {
		return cardsManagement_InputCIFNumber;
	}

	@FindBy(xpath = "//input[@name='ACC_GL']")
	private WebElement cardsManagement_InputGLNumber;

	public WebElement cardsManagementInputGLNumber() {
		return cardsManagement_InputGLNumber;
	}

	@FindBy(xpath = "//input[@name='STATUS']")
	private WebElement cardsManagement_InputCardStatus;

	public WebElement cardsManagementInputCardStatus() {
		return cardsManagement_InputCardStatus;
	}

	@FindBy(xpath = "//td[@tdlabel='Application ID']")
	private WebElement cardsManagement_GetApplicationID;

	public WebElement cardsManagementGetApplicationID() {
		return cardsManagement_GetApplicationID;
	}

	@FindBy(xpath = "//td[@tdlabel='SL']")
	private WebElement cardsManagement_GetSerialNumber;

	public WebElement cardsManagementGetSerialNumber() {
		return cardsManagement_GetSerialNumber;
	}
	@FindBy(xpath="//span[contains(text(),'Query')]")
	private WebElement cardManagement_QueryFeature;
	public WebElement cardManagementQueryFeature()
	{
		return cardManagement_QueryFeature;
	}
}
