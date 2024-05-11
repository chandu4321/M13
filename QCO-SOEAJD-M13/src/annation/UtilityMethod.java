package annation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethod {

	public String getDataFromPropertyFile(String key) throws IOException {
		File file = new File("./testData/data.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties p= new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public String getDataFromExcelFile(String sheetname, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		File file= new File("./testData/dataExcel.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet= wb.getSheet("Sheet1");
		return sheet.getRow(rowNum).getCell(cellNum).toString();
	}
}
