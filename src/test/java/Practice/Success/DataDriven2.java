package Practice.Success;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs= new FileInputStream("C:\\Users\\Anurag rana\\Downloads\\data.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fs);
		XSSFSheet sheet = null;
		ArrayList<String> data= new ArrayList<String>();
		int pages=workbook.getNumberOfSheets();
		for(int i=0;i<pages;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Data"))
				sheet=workbook.getSheetAt(i);
		}
		Iterator <Row> rows= sheet.iterator();
		while(rows.hasNext())
		{
			Row rowCounter=rows.next();
			if(rowCounter.getCell(0).getStringCellValue().equalsIgnoreCase("Mother"))
			{
				Iterator <Cell> ce= rowCounter.cellIterator();
				while(ce.hasNext())
				{
					Cell cellData=ce.next();
					data.add(cellData.getStringCellValue());
				}
			}
		}
		System.out.println(data);
		

	}

}
