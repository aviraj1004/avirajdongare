package qsp;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchMicrosoftEdge {

	public static void main(String[] args) throws InterruptedException {
		// to lunch EdgeBrowser
		
		//System.setProperty("webdriver.edge.chrome", "./drivers/msrdgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.close();
		
	}

}
