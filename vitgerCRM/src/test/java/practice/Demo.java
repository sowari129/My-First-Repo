package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='jazoest']")).sendKeys("byisbhgsdj");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ewrre");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
