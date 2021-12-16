package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Launch the site
		driver.manage().window().maximize();
		driver.navigate().to("file:///D:/Html%20trial/Demosite.html");
		WebElement var=driver.findElement(By.xpath("//a[text()='Amazon']"));
		var.getText();
		var.getClass();
		var.getTagName();
		var.getSize();
		
        
       
	}

}
