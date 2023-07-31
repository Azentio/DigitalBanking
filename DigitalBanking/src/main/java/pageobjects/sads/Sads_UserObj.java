package pageobjects.sads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sads_UserObj {
	
	WebDriver driver;
	public Sads_UserObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement sads_ParameterFeature;
	public WebElement sadsParameterFeature()
	{
		return sads_ParameterFeature;
	}
	@FindBy(xpath="//td[text()='User']")
	private WebElement parameter_UserFeature;
	public WebElement parameterUserFeature()
	{
		return parameter_UserFeature;
	}
	@FindBy(xpath="//td[text()='User']//ancestor::a/following-sibling::ul//span[text()='Maintenance']")
	private WebElement user_MaintenanceFeature;
	public WebElement userMaintenanceFeature()
	{
		return user_MaintenanceFeature;
	}
	@FindBy(xpath="//input[@name='USER_ID']")
	private WebElement user_SearchUserName;
	public WebElement userSearchUserName()
	{
		return user_SearchUserName;
	}
	@FindBy(id="lookuptxt_CIF_NO_P005M")
	private WebElement user_CIFNumberInput;
	public WebElement userCIFNumberInput()
	{
		return user_CIFNumberInput;
	}
	@FindBy(id="lookuptxt_CIF_NO_P005P")
	private WebElement user_ApprovalCIFNumberInput;
	public WebElement userApprovalCIFNumberInput()
	{
		return user_ApprovalCIFNumberInput;
	}
	@FindBy(xpath="//td[text()='User']//ancestor::a/following-sibling::ul//span[text()='Approve']")
	private WebElement user_ApproveFeature;
	public WebElement userApproveFeature()
	{
		return user_ApproveFeature;
	}

}
