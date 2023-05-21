package AutomationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdrver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=eFdiWS53QkVOMERlVjliYm5KTE5wcFlQd0t4RFl3czNVeE9NMXRHV3ppdlVB_en-GB_false_&nonce=eFdiWS53QkVOMERlVjliYm5KTE5wcFlQd0t4RFl3czNVeE9NMXRHV3ppdlVB&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=RWEo6_CstWIBo9nKllIOodNGDcmDuWZbZ6cyOwxdMbk&ui_locales=en-GBsssss");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"Email Address\"]")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abcdefghi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}

}
