package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestBase {
	public static WebDriver driver=null;
	public static Properties CONFIG=null;
	

	
	public void initConfigurations(){
		
		
		
		 CONFIG = new Properties();
		try {
			FileInputStream fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
			//CONFIG.load(fs);
			CONFIG.load(fs);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void initDriver(){
		if(driver==null){
		if(CONFIG.getProperty("browser").equals("Mozilla"))
			driver=new FirefoxDriver();
		else if(CONFIG.getProperty("browser").equals("IE")){
			System.setProperty("webdriver.ie.driver", "Constants.IEdriverServerPath");
			driver=new InternetExplorerDriver();
		}
		else if(CONFIG.getProperty("browser").equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","Constants.ChromedriverServerPath");
			driver=new ChromeDriver();
		}
		}
	}
	
	// screenshot
	public void takeScreenshot() throws IOException{
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File(Constants.Screenshot_File_Path));

		
	}
	
	
	public void quitDriver(){
		driver.quit();
	}

}
