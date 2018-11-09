package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String frameworkPath = System.getProperty("user.dir");
		String driverPath = frameworkPath+"\\Data"+"\\drivers";
		System.setProperty("webdriver.ie.driver", driverPath+"\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
