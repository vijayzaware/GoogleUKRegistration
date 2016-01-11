package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	
public class GmailHomePage {
	WebDriver driver;
	
	@FindBy(id=Constants.createAccountLink)
	public WebElement createAccountLink;
	
	
	
	public GmailHomePage(WebDriver dr){
		driver=dr;
	}

	public Gmail_RegistrationPage goToGmailCreateAccountPage(){
		createAccountLink.click();
		return PageFactory.initElements(driver, Gmail_RegistrationPage.class);
	}
	


}
