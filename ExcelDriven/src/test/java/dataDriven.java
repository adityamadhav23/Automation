import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	
	public static void main(String[] args) throws IOException {
				}


	public ArrayList<String> getData(String testCaseName) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		FileInputStream fis= new FileInputStream("D://programmes//eclipse-workspace//ExcelDriven//demodata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int sheetCount=workbook.getNumberOfSheets();
		for(int i=0;i<sheetCount;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
			XSSFSheet sheet=workbook.getSheetAt(i);
			
			Iterator<Row> rows=sheet.iterator();
			Row firstrow=rows.next();
			Iterator<Cell> ce=firstrow.cellIterator();
			//To get all the column names and search TestCases
			int k=0;
			int column=0;
			while(ce.hasNext()){
				Cell value=ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("Testcases")) {
				column=k;}
				k++;
				}
			System.out.println(column);
			
		//once column is identified then scan entire testcase column to identify purchase testcase row
			while(rows.hasNext()) {
				Row r=rows.next();
				if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")) {
					Iterator<Cell> cv=r.cellIterator();
					while(cv.hasNext()) {
						a.add(cv.next().getStringCellValue());
					}
				}
			}
			}
			}
		return a;


	}
	}


