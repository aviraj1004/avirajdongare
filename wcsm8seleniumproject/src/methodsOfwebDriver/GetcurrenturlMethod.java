package methodsOfwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class GetcurrenturlMethod {

	public static void main(String[] args) {

		//System.setProperty("webdriver.edge.chrome", "./drivers/msrdgedriver.exe");

		 EdgeOptions ed = new EdgeOptions();
		 ed.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new EdgeDriver(ed);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		 String url = driver.getCurrentUrl();
		 System.out.println(url);

	}

}
