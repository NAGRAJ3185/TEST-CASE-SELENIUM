import org.openqa.selenium.chrome.ChromeDriver;

public class Browser 
{
public static void main(String[] args) 
	{
	System.setProperty("WebDriver.chrome.driver","D:/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("htttp://google.com");
	}
}