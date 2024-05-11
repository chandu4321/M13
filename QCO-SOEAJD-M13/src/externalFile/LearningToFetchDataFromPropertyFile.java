package externalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToFetchDataFromPropertyFile {
	public static void main(String[] args) throws IOException {

		// 1)Create a file
		File file = new File("./testData/data.properties");

		// 2)Create a FileInputStream
		FileInputStream fis = new FileInputStream(file);

		// 3)create a object for property file
		Properties p = new Properties();

		p.load(fis);

		String Url = p.getProperty("url").toString();
		System.out.println(Url);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.quit();
		// driver.get("https://demowebshop.tricentis.com/");
	}
}