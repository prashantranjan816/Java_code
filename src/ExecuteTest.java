
//package gmail.com.test;

//import gmail.com.keywords.Keywords;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecuteTest {

	static Keywords keyword;
	public static void main(String[] args) throws IOException {
		keyword = new Keywords();
		ArrayList data = new ArrayList();
		FileInputStream file = new FileInputStream("B://JvaPjct//src//ObjectRepository.xlsx");
		XSSFWorkbook workbook  = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("OR");
		Iterator row = sheet.iterator();
		while (row.hasNext()) {
			
			Row rowIterator = (Row) row.next();
			Iterator cellItr = rowIterator.cellIterator();
			
			while (cellItr.hasNext()) {
				Cell cell = (Cell) cellItr.next();
				switch (cell.getCellType()) {
				
				case Cell.CELL_TYPE_STRING:
					data.add(cell.getStringCellValue());
				    break;
				case Cell.CELL_TYPE_BOOLEAN:
					data.add(cell.getBooleanCellValue());
				    break;
				case Cell.CELL_TYPE_NUMERIC:
					data.add(cell.getNumericCellValue());
				    break;
				
				}
			}
			
		}
		
		for (int i=3;i<data.size();i++){
			
			if (data.get(i).equals("openbrowser")) {
				System.out.println(data.get(i));
				keyword.openbrowser();
			}
			if (data.get(i).equals("navigate")) {
				String key = (String) data.get(i);
				String testData = (String) data.get(i+1);
				String objectName = (String) data.get(i+2);
				keyword.navigate(testData);
			}
			if (data.get(i).equals("input")) {
				String key = (String) data.get(i);
				String testData = (String) data.get(i+1);
				String objectName = (String) data.get(i+2);
				System.out.println(key);
				System.out.println(testData);
				System.out.println(objectName);
				keyword.input(testData,objectName);
				
			}
			if (data.get(i).equals("click")){
				String key = (String) data.get(i);
				String testData = (String) data.get(i+1);
				String objectName = (String) data.get(i+2);
				System.out.println(key);
				System.out.println(testData);
				System.out.println(objectName);
				keyword.click(objectName);
				
			}
		}
		

	}

}
