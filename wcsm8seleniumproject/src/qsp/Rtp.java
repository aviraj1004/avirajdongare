package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Rtp {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//ask the input from usrs
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the browser which u want to open");
		String browserValue = sc.next();
         
		if (browserValue.equalsIgnoreCase("chrome"))
		{
			//to avoid IllegalException
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			
			//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			FirefoxOptions fo = new FirefoxOptions();
            fo.addArguments("--remote allow-origins=*");
            
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.close();
		}
		else
		{
			System.out.println("Enter the correct browser details");
		}
		
	}
	

}
