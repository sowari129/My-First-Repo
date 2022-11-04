package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws InterruptedException  
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/viren/OneDrive/Desktop/sample.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
