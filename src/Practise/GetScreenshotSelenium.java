package Practise;

public class GetScreenshotSelenium {
	
	File screenshot=((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destinationpath=<path to store the screenshot>
	Fileutils.copyFile(screenshot,new File(destinationpath));
	
	
	

}
