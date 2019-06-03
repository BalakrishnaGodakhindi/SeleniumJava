package sampled;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void testGoogleTitle() {
	  
	  String path="C:\\Users\\Ganesh\\Desktop\\Balakrishna\\chromedriver_win32_1\\chromedriver.exe";
	  
	  System.setProperty("webdriver.chrome.driver", path);
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.co.in");
	  String title = driver.getTitle();
	  System.out.println(title);
	  System.out.println("This is testing Jenkins - Git and Gradle comments are added");
	  Assert.assertEquals(title, "Google");
	  driver.close();
  }
}

