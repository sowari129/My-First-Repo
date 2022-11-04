package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/viren/OneDrive/Desktop/sample3.html");
		driver.findElement(By.xpath("//<input[@id='i1w']")).sendKeys("hi");
		driver.findElement(By.xpath("//<input[@id='sf']")).sendKeys("hello");
		driver.findElement(By.xpath("//<input[@name='safese']")).click();
		driver.findElement(By.xpath("//<input[@class='qefee']")).click();
		driver.findElement(By.xpath("//<input[@id='adqw']")).click();
		driver.findElement(By.xpath("//<input[@id='afef']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
