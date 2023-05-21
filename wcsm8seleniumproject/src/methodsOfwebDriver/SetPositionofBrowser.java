package methodsOfwebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SetPositionofBrowser {

	public static void main(String[] args) throws InterruptedException {
		

		//System.setProperty("webdriver.edge.chrome", "./drivers/msrdgedriver.exe");

		 EdgeOptions ed = new EdgeOptions();
		 ed.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new EdgeDriver(ed);
		driver.manage().window().maximize();
		
		  Point targetposition = new Point(450, 350);
		  Thread.sleep(2000);
		  driver.manage().window().setPosition(targetposition);
  
		  
	}

}
