package OrangeHrm.OrangeHrm;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
	public static String url1 = "https://opensource-demo.orangehrmlive.com/";
	
	public static Logger logeer = LogManager.getLogger(BaseClass.class);
	
     @BeforeTest
    public void LoginTest() throws MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "/Users/mistreaderaw/Downloads/chromedriver");
        //driver= new ChromeDriver();
    	 // browser variable,,,where the slenium hub_host= localhost 

    	 String host= "localhost";
    	 DesiredCapabilities dc=  DesiredCapabilities.chrome();
    	 
    	 if (System.getProperty("BROWSER") != null && System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
    		 dc= DesiredCapabilities.firefox();
    	 }
    	 if(System.getProperty("HUB_HOST") !=null ) {
    		 host=System.getProperty("HUB_HOST");
    	 }
    	 
      String completeurl= "http://" + host + ":4444/wd/hub";
      driver= new RemoteWebDriver(new URL(completeurl),dc);
    	 
        //System.setProperty("webdriver.gecko.driver", "/Users/mistreaderaw/Downloads/geckodriver");
        //driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        logeer.info(" log try");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.get(url1);
    
    }
  
    
  
  
   
	
	            
	}
