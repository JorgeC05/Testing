package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		
		WebDriverWait wait = new WebDriverWait(driver,5);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK"))).click();
		
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a[1]")).click();
		
		WebElement menu = driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[8]/a"));
		
		Actions action = new Actions(driver);		
		action.moveToElement(menu).perform();
		
		driver.findElement(By.linkText("Practice site 1")).click();

	}

}
