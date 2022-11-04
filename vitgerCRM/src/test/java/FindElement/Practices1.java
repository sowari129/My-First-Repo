package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practices1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/viren/OneDrive/Desktop/sample.html.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"abc\"]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
