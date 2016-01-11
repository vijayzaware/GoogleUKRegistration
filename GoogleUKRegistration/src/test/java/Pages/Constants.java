package Pages;

public class Constants {
	
	
	//PATH
	public static String CONFIG_FILE_PATH =System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties";
	public static String Screenshot_File_Path=System.getProperty("user.dir")+"\\Screenshot\\ErrorMessage.jpg";
	public static String IEdriverServerPath=System.getProperty("user.dir")+"\\IEDriverServer.exe";
	public static String ChromedriverServerPath=System.getProperty("user.dir")+"\\chromedriver.exe";
	
	
	
	//xpath,id's
	//Google HomePage
	public static final String appsButton="//a[@title='Google apps']";
	public static final String gmailLink="//a[@href='https://mail.google.com/mail/?tab=wm']";
	
	//Gmail HomePage
	public static final String createAccountLink ="link-signup";
	
	//Gmail Registration Page
	public static final String firstName="FirstName";
	public static final String lastName="LastName";
	public static final String password="Passwd";
	public static final String confirmPassword="PasswdAgain";
	public static final String monthOfBirthDate="//span[@id='BirthMonth']/div";
	public static final String dayOfBirth="//input[@name='BirthDay']";
	public static final String yearOfBirth="//input[@id='BirthYear']";
	public static final String gender="//div[@id='Gender']/div";
	public static final String recoveryPhoneNumber="//input[@id='RecoveryPhoneNumber']";
	public static final String recoveryEmailId="//input[@id='RecoveryEmailAddress']";
	public static final String SkipCaptcha="SkipCaptcha";
	public static final String location="//div[@id=':h']";
	public static final String acceptTermsOfServiceCheckbox="TermsOfService";
	public static final String nextButton="submitbutton";
	public static final String errorMessage="errormsg_0_GmailAddress";
	
	
	
	
	
	
	
	

}
