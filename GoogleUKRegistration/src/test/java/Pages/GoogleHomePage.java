package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class GoogleHomePage extends TestBase {
	
public WebDriver driver;
	
	@FindBy(xpath=Constants.appsButton)
	public WebElement appsButton;
	@FindBy(xpath=Constants.gmailLink)
	public WebElement gmailLink;
	
	
	public GoogleHomePage(WebDriver dr){
		driver=dr;
	}

	public GmailHomePage goToGmail(){
		
		//Get Test URL "https://www.google.co.uk/" from config.properties file
		String testSiteUrl=CONFIG.getProperty("testSiteLadingPageURL");
		driver.get(testSiteUrl);
	
		//appsButton.click();
		gmailLink.click();
		return PageFactory.initElements(driver, GmailHomePage.class);
		
	}

}
