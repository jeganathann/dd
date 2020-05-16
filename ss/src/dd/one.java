package dd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   System.setProperty("WebDriver.CromeDriver.Driver", "D:\\chromedriver_win32\\chromedriver_win32exe");
	
   ChromeDriver Driver = new ChromeDriver();
   
   Driver.get("https://www.google.com/");
   WebElement w = Driver.findElement(By.name("q"));
   WebElement x = Driver.findElement(By.name("btnK"));
   
   w.sendKeys("hello");
   x.click();
   Thread.sleep(5000);
   Driver.navigate().back();
   Thread.sleep(5000);
   w.clear();
   x.click();
   Thread.sleep(5000);
   Driver.navigate().back();
   w.sendKeys(Keys.chord("bye"));
   x.click();
   Thread.sleep(5000);
   Driver.navigate().back();
   w.sendKeys(Keys.chord("bye"));
   Thread.sleep(5000);
   w.sendKeys(Keys.CONTROL,"a");
   Thread.sleep(5000);
   w.sendKeys(Keys.CONTROL,"x");
   Thread.sleep(5000);
   w.sendKeys(Keys.chord("good moring"));
   Thread.sleep(5000);
   x.click();
	}

}
