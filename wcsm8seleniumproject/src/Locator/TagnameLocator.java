package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagnameLocator {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Eagle%20Computer/Desktop/HTML/Textbox.html");
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
	}

}
