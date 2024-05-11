package externalFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningToFetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//1)create a file
		File file= new File("./testData/dataExcel.xlsx");
		
		//2)create a FileInputStream
		FileInputStream fis=new FileInputStream(file);
		
		//3)Create a object for Workbook
		Workbook wb= WorkbookFactory.create(fis);
		
		
		String Url = wb.getSheet("Sheet1").getRow(4).getCell(2).getStringCellValue();
		System.out.println(Url);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
	}
}
