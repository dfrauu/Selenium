package Selenium_Package;

// Librerias de acceso y navegacion de Chrome 107
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class primera_prueba {
	
	public static void main (String[] args)throws InterruptedException {
	
		// Referencia al driver dentro del directorio con nuestras librerias y controladores
		System.setProperty("webdriver.chrome.driver","C://Selenium/chromedriver107.exe");
		WebDriver driver = new ChromeDriver();
		
		// Secuencia de acciones en Selenium
		driver.get("https://www.amazon.com/");
			
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-autoid-2-announce")).click();
		
		// Temporizador de inactividad y orden de cierre
		Thread.sleep(5000);
		driver.quit();
	
	}
	
}
