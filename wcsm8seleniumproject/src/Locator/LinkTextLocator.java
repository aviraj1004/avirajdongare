package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.edge.chrome", "./drivers/msrdgedriver.exe");

		 EdgeOptions ed = new EdgeOptions();
		 ed.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new EdgeDriver(ed);
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Eagle%20Computer/Desktop/HTML/Linkwebelement.html");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Flipkartlink")).click();

	}

}
