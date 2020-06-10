package UTILITIES;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import OrangeHrm.OrangeHrm.BaseClass;

public class utilities extends BaseClass {
	
	public static void getScreenShot()  {
	      
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   try {
		FileUtils.copyFile(scrFile, new File("/Users/mistreaderaw/eclipse-workspace/OrangeHrm/tests.jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}