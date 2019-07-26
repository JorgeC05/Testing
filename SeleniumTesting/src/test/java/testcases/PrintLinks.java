package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintLinks {
	
	public static WebDriver driver;
	public static String url  = "https://www.google.com.co/";
	
	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		 driver.get(url);
		 driver.findElement(By.name("q")).sendKeys("Way2Automation");
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
		 
		 WebElement SearchBotton = driver.findElement(By.name("btnK"));		 
		 SearchBotton.click();	
		 
		 driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a[1]")).click();
		 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("There are: "+ links.size() + " links in this page" );
		 System.out.println("The text links are:");
		 
		 for(WebElement link: links){
			 System.out.println(link.getText() + " link " + link.getAttribute("href")); 			 
		 }		 
		 
	}

}
