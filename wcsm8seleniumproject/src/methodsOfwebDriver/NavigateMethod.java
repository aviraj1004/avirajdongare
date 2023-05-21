package methodsOfwebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.edge.chrome", "./drivers/msrdgedriver.exe");

		 EdgeOptions ed = new EdgeOptions();
		 ed.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new EdgeDriver(ed);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000);
		
       driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	     
	     // use back operation 
	     Thread.sleep(2000);
	     driver.navigate().back();
	     Thread.sleep(2000);
	     driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
	     Thread.sleep(2000);
	     driver.navigate().back();
	     Thread.sleep(2000);
	     driver.navigate().forward();
	     Thread.sleep(2000);
	     driver.navigate().refresh();
	     Thread.sleep(2000);
	     driver.quit();

	}

}
