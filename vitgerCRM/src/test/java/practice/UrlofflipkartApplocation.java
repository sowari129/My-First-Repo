package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlofflipkartApplocation {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	String url=driver.getCurrentUrl();
	System.out.println(url);

	}

}
