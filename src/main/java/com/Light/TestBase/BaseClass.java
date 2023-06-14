package com.Light.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Light.utilities.ScreenshotUtilities;
import com.Light.utilities.WebDriverUtilities;

public class BaseClass {





	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("registration");
	public static WebDriverWait wait;
	public static String browser;
	public static WebDriverUtilities wb=new WebDriverUtilities();
	

	ScreenshotUtilities ss=new ScreenshotUtilities();
	@BeforeSuite
	public void setUp() {


		if (driver == null) {
			
			

			PropertyConfigurator.configure("Log4j.properties");

			try {
				fis = new FileInputStream(
						"C:\\JavaEclipse\\Light.FrameWork\\src\\test\\resources\\Config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				config.load(fis);
				log.debug("Config file loaded !!!");
			} catch (IOException e) {
				e.printStackTrace();
			}



			if (config.getProperty("browser").equals("firefox")) {

				driver = new FirefoxDriver();

			} else if (config.getProperty("browser").equals("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
				driver = new ChromeDriver();
				log.debug("Chrome Launched !!!");
			} else if (config.getProperty("browser").equals("edge")) {

				System.setProperty("webdriver.edge.driver",
						System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe");
				driver = new EdgeDriver();

			}

			driver.get(config.getProperty("MinnwestUrl"));
			log.debug("Navigated to : " + config.getProperty("MinnwestUrl"));
			driver.manage().window().maximize();
			
			ss.CaptureScreenshot(driver, driver.getTitle());
			log.debug("Opening the browser");
		}	
	}

//	@AfterSuite
//	public void tearDown() {
//
//
//		driver.quit();
//
//		log.debug("test execution completed !!!");
//		System.out.println("Completed");
//	}
}