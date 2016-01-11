package Pages;

import java.io.IOException;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


@SuppressWarnings("deprecation")
public class Gmail_RegistrationPage extends TestBase {
	String expectederrorMessage="You can't leave this empty.";
	WebDriver driver;
	
	@FindBy(id=Constants.firstName)
	public WebElement firstName;
	@FindBy(id=Constants.lastName)
	public WebElement lastName;
	@FindBy(id=Constants.password)
	public WebElement password;
	@FindBy(id=Constants.confirmPassword)
	public WebElement confirmPassword;
	@FindBy(xpath=Constants.monthOfBirthDate)
	public WebElement monthOfBirthDate;
	@FindBy(xpath=Constants.dayOfBirth)
	public WebElement dayOfBirth;
	@FindBy(xpath=Constants.yearOfBirth)
	public WebElement yearOfBirth;
	@FindBy(xpath=Constants.gender)
	public WebElement gender;
	@FindBy(xpath=Constants.recoveryPhoneNumber)
	public WebElement recoveryPhoneNumber;
	@FindBy(xpath=Constants.recoveryEmailId)
	public WebElement recoveryEmailId;
	@FindBy(id=Constants.SkipCaptcha)
	public WebElement SkipCaptcha;
	@FindBy(id=Constants.acceptTermsOfServiceCheckbox)
	public WebElement acceptTermsOfServiceCheckbox;
	@FindBy(id=Constants.nextButton)
	public WebElement nextButton;
	@FindBy(id=Constants.errorMessage)
	public WebElement errorMessage;
	
	
	
	
	public Gmail_RegistrationPage(WebDriver dr){
		driver=dr;
	}

	public Gmail_RegistrationPage goToGmail_RegistrationPage() throws IOException, InterruptedException{
		
		//Reading test data from properties file and providing to test
		try {
			
			firstName.sendKeys(CONFIG.getProperty("fName"));
			lastName.sendKeys(CONFIG.getProperty("lName"));
			password.sendKeys(CONFIG.getProperty("pwd"));
			confirmPassword.sendKeys(CONFIG.getProperty("confirmPwd"));
			monthOfBirthDate.sendKeys(CONFIG.getProperty("monthOfBirth"));
			dayOfBirth.sendKeys(CONFIG.getProperty("birthDay"));
			yearOfBirth.sendKeys(CONFIG.getProperty("birthYear"));
			gender.sendKeys(CONFIG.getProperty("gender"));
			recoveryPhoneNumber.sendKeys(CONFIG.getProperty("recoveryPhone")); 
			recoveryEmailId.sendKeys(CONFIG.getProperty("recoveryMail"));
			SkipCaptcha.click();
			acceptTermsOfServiceCheckbox.click();
			nextButton.click();
		} catch (Throwable t) {
			System.out.println(t);
		}
		
		
		//Verification of Error
		String actualErrorMessage=errorMessage.getText();
		Assert.assertEquals(expectederrorMessage, actualErrorMessage);
		
		
		//Take screenshot of error Message and store it in folder "Screenshot" in current project
		takeScreenshot();
		
		return PageFactory.initElements(driver, Gmail_RegistrationPage.class);
	}
	
	
	

}
