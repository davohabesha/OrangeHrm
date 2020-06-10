package OrangeHrm.OrangeHrm;

import org.testng.annotations.Test;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.listeners.class)			

public class AddMemeberTset extends BaseClass{
	public static void getScreenShot()  {
	      
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   try {
		FileUtils.copyFile(scrFile, new File("/Users/mistreaderaw/eclipse-workspace/OrangeHrm/Screenshots/tests.jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}}
	@Test(priority=1)
	    void login(){
	   WebElement usern= driver.findElement(By.id("txtUsername"));
	   usern.sendKeys("Admin");
	    WebElement  userp= driver.findElement(By.id("txtPassword"));
	userp.sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	logeer.info("user able to login");
	}
	@Test(priority = 2)
	    void adminlik(){
	        WebElement element= driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
	        WebElement usermaelement=driver.findElement(By.xpath(" //*[@id=\"menu_admin_UserManagement\"]"));
	        WebElement userelement= driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
	        Actions action = new Actions(driver);
	        action.moveToElement(element).build().perform();
	        action.moveToElement(usermaelement).build().perform();
	        action.click(userelement).build().perform();
	        logeer.info("user able to click on admin link");
	}
	@Test (priority= 3)
	    void AddEmployee()
	{
	        driver.findElement(By.xpath("//*[@value= 'Add'] ")).click();
	        driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys( "John Smith" );
	        driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys(" dave123");
	        WebElement element = driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]"));
	        Select statusdrd= new Select(element);
	        
	      ArrayList<WebElement> drd= (ArrayList<WebElement>) statusdrd.getOptions();
	    int drdsize= drd.size();
	    System.out.println(drdsize);
	    for (int i=0; i<drd.size();i++){
	        System.out.println(drd.get(i).getText());
	    }
	        driver.findElement(By.xpath("//*[@id=\"systemUser_password\"] ")).sendKeys("Dave@123");
	        driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"] ")).sendKeys("Dave@123");
	        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

	}
	@Test(priority= 4)
	void logout (){
	        driver.findElement(By.xpath("//*[@id=\"welcom\"]")).click();
	        driver.findElement(By.xpath(" //*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	}
	@Test(priority=5)
	    public void LoginAsEmployee(){
	        WebElement usern= driver.findElement(By.id("txtUsername"));
	        usern.sendKeys("dave123");
	        WebElement  userp= driver.findElement(By.id("txtPassword"));
	        userp.sendKeys("Dave@123");
	        driver.findElement(By.id("btnLogin")).click();
	    }
	

	  }

