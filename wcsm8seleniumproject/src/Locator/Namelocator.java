package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Namelocator {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.edge.chrome", "./drivers/msrdgedriver.exe");

		 EdgeOptions ed = new EdgeOptions();
		 ed.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new EdgeDriver(ed);
		driver.manage().window().maximize();
		
		driver.get("http://desktop-as1kh32/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("logout")).click();
	}
}
