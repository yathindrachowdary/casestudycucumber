package browserPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {
static WebDriver driver;

	public static WebDriver startBrowser(String browsername,String url) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.05.01\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver(); 
		}
			driver.manage().window().maximize();
			driver.get(url);
			
		
		
		return driver;
		
	}
}
