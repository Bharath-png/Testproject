import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.google.com/");
		 System.out.println(driver.getTitle());
		 
		 System.out.println(driver.getCurrentUrl());
		 
		 

	}

}
