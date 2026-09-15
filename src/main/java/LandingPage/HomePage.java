package LandingPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Browser
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println("hello for testing");
		System.out.println("hello for regression testing");
		
		driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		
		String title = driver.getTitle();
		
		//checking title for web page 
		if (title.contains("Online Shopping site in India"))
				{
			System.out.println("Title is correct");
				}
		else {
			System.out.println(title);
		}
		
		//Locator search box and serach for iphone
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbox.sendKeys("Iphone");
	//click on submit button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//close driver browser
		driver.quit();
	
	}

}
