package dd;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	public void main()
	{
		   System.setProperty("WebDriver.CromeDriver.Driver", "D:\\chromedriver_win32\\chromedriver_win32exe");

		WebDriver d1 = new chromedriver();
		d1.get("https://www.google.com/");
		d1.close();
	}
  @Test
  public void f() {
	   System.setProperty("WebDriver.CromeDriver.Driver", "D:\\chromedriver_win32\\chromedriver_win32exe");

	   WebDriver d1 = new chromedriver();
       d1.get("https://www.facebook.com/");
       d1.manage().window().maximize();
  }
}
