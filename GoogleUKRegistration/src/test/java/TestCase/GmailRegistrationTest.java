package TestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.GmailHomePage;
import Pages.Gmail_RegistrationPage;
import Pages.GoogleHomePage;
import Pages.TestBase;

public class GmailRegistrationTest extends TestBase {

	@BeforeSuite
	public void initialize(){
		initConfigurations();
		initDriver();
	}
	
	
	@Test
	
	public void start() throws InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

		GoogleHomePage googlehome=PageFactory.initElements(driver, GoogleHomePage.class);
		GmailHomePage gmailhome=googlehome.goToGmail();
		Gmail_RegistrationPage gmailreg=gmailhome.goToGmailCreateAccountPage();
		gmailreg.goToGmail_RegistrationPage();
		
	}
	
	
	@AfterSuite
	public void closeBrowser(){
		quitDriver();
	}
}
	
	


