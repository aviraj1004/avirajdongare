package AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HotstarLoginPaage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnurl=/in/subscribe/my-account");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"phoneNo\"]")).sendKeys("7378706484");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"submit-button\"]")).click();
		
		driver.quit();
	    
		
	}

}
