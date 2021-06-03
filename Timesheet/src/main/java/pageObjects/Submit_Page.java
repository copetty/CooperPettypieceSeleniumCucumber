package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class Submit_Page extends BasePage{
	
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]") WebElement textfield_Username;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]") WebElement button_submitButton;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]") WebElement textfield_Password;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]") WebElement button_LoginButton;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/header[1]/button[1]") WebElement button_TimesheetButton;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]") WebElement textArea_Monday;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]") WebElement textArea_Tuesday;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]") WebElement textArea_Wednesday;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]") WebElement textArea_Thursday;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]") WebElement textArea_Friday;
	public @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[1]") WebElement button_TimesheetSubmitButton;

	public Submit_Page() throws IOException {
		super();
	}
	
	public Submit_Page getSubmitPage() throws IOException {
		getDriver().get("https://rev2.force.com/s/");
		return new Submit_Page();
	}
	
	public Submit_Page enterUsername(String username) throws Exception {
		sendKeysToWebElement(textfield_Username, username);
		return new Submit_Page();
	}
	
	public Submit_Page clickOnSubmitButton() throws Exception {
		waitAndClickElement(button_submitButton);
		return new Submit_Page();
	}
	
	public Submit_Page enterPassword(String password) throws Exception{
		sendKeysToWebElement(textfield_Password, password);
		return new Submit_Page();
	}
	
	public Submit_Page clickOnLoginButton() throws Exception{
		waitAndClickElement(button_LoginButton);
		return new Submit_Page();
	}
	
	public Submit_Page clickOnTimesheetButton() throws Exception {
		waitAndClickElement(button_TimesheetButton);
		return new Submit_Page();
	}
	
	public Submit_Page enterMondayHours(String monday) throws Exception {
		sendKeysToWebElement(textArea_Monday, monday);
		return new Submit_Page();
	}
	
	public Submit_Page enterTuesdayHours(String tuesday) throws Exception {
		sendKeysToWebElement(textArea_Tuesday, tuesday);
		return new Submit_Page();
	}
	
	public Submit_Page enterWednesdayHours(String wednesday) throws Exception {
		sendKeysToWebElement(textArea_Wednesday, wednesday);
		return new Submit_Page();
	}
	
	public Submit_Page enterThursdayHours(String thursday) throws Exception {
		sendKeysToWebElement(textArea_Thursday, thursday);
		return new Submit_Page();
	}
	
	public Submit_Page enterFridayHours(String friday) throws Exception {
		sendKeysToWebElement(textArea_Friday, friday);
		return new Submit_Page();
	}
	
	@SuppressWarnings("deprecation")
	public Submit_Page confirmSubmitButton() throws Exception {
		WaitUntilWebElementIsVisible(button_TimesheetSubmitButton);
		Assert.assertEquals(true, button_TimesheetSubmitButton.isDisplayed());
		return new Submit_Page();
	}
	
	
	
	

}
