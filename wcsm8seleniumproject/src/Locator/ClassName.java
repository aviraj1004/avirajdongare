package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ClassName {
	
	public static void main(String[] args) throws InterruptedException {
		

		//System.setProperty("webdriver.edge.chrome", "./drivers/msrdgedriver.exe");

		 EdgeOptions ed = new EdgeOptions();
		 ed.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new EdgeDriver(ed);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
	}

}
