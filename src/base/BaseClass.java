package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
	//code for properties file, this baseclass meant to be inherited by other classes.
	//parent class
	static File file;
	static Properties prop;
	static FileInputStream fip;
	static String filepath = System.getProperty("user.dir")+"//src//config//config.properties";
	public static WebDriver driver;
	
	public static void initializeProp() {
		file = new File(filepath);
		try {
			fip = new FileInputStream(file);
			prop = new Properties();
			prop.load(fip);
		} catch (IOException e) {
			System.out.print("FileNotFoundException"+ e.getMessage());
		}
	}
	public static String readProperty(String key) {
		return prop.getProperty(key);
	}
	
	public static void launchApp() {
		System.setProperty("webdriver.chrome.driver", BaseClass.readProperty("ChromeDriverPath"));
		driver = new ChromeDriver();
		driver.get(readProperty("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 60);
	}
	
	public static void closeApp() {
		driver.close();
	}
	
	public static void takeSnapshot(String fileName) throws IOException {
		TakesScreenshot srcshot = ((TakesScreenshot)driver);
		File srcFile = srcshot.getScreenshotAs(OutputType.FILE);
		String destfilepath = readProperty("SrcPath");
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh-m-ss");
        Date date = new Date(System.currentTimeMillis());
        String timestamp = dateFormat.format(date);
		File destFile = new File(destfilepath.concat(fileName).concat(timestamp).concat(".png"));
		FileUtils.copyFile(srcFile, destFile);
	}
	
	public static void click(By key) {
		driver.findElement(key).click();
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
	

}
