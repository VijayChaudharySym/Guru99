package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppTest {
	
	protected WebDriver driver;
	@Test
  public void guru99tutorials() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setPlatform(Platform.LINUX);
		//driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), caps);
		driver = new RemoteWebDriver(new URL("http://redzonetest2.symc.symantec.com/wd/hub"), caps);
        String eTitle = "Meet Guru99";
        String aTitle = "";
        // launch Firefox and redirect it to the Base URL
        driver.get("http://www.guru99.com/");
        //maximises the browser window
        driver.manage().window().maximize();
        // get the actual value of the title
        aTitle = driver.getTitle();
        // compare the actual title  with the expected title 
        if (aTitle.contentEquals(eTitle)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }        
        //close Firefox browser
        driver.close();
		
	}
}
