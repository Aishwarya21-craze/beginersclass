import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
		File file = new File(
				"C:\\Users\\Nandhini.devi\\OneDrive - Happiest Minds Technologies Pvt Ltd\\Testing-Training\\testData-beginners.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String testID = wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String userid = wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		String password = wb.getSheet("Login").getRow(1).getCell(2).getStringCellValue();
		System.out.println("test ID :" + testID);
		System.out.println("user ID :" + userid);
		System.out.println("Password :" + password);
		System.out.println(wb.getSheet("Login").getLastRowNum());
		System.out.println(wb.getSheet("Login").getRow(1).getLastCellNum());
	}

}
