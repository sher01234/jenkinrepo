package practiSe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void demo() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileInputStream fis =new FileInputStream("./data/ComonFile.properties");
		Properties p=new Properties();
		p.load(fis);
		System.out.println("login to application");
		String Url = p.getProperty("url");
		String UserName = p.getProperty("un");
		String PassWord = p.getProperty("pw");
		
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("hellow");
		System.out.println("welcome to jenkin");
		System.out.println("good evening");
		
	}

}
