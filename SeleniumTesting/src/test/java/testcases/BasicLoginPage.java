package testcases;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicLoginPage {
	
	public static WebDriver driver; 
	public static String url = "http://qa.way2automation.com";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver  = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.get(url);			
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

			
		driver.findElement(By.name("name")).sendKeys("Jorge Cortés");	
		driver.findElement(By.name("phone")).sendKeys("123456");
		driver.findElement(By.name("email")).sendKeys("prueba@prueba.com");
		driver.findElement(By.name("country")).sendKeys("Colombia");	
		driver.findElement(By.name("city")).sendKeys("Colombia");		
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[6]/input")).sendKeys("Jorge");
		driver.findElement(By.xpath("//*[@id='load_form']/fieldset[7]/input")).sendKeys("Jorge");
		WebElement boton  = driver.findElement(By.xpath("(//input[@type='submit'] [@class='button'])[2]"));
		boton.click();	
	}

}
