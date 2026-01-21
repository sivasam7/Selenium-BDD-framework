import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static Workbook workbook;
	private static Sheet sheet;
	
	//Set Excel Path
	public static void setExcelFile(String excelPath, String sheetName) {
		try {
			FileInputStream file = new FileInputStream(excelPath);
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheet(sheetName);
			if(sheet == null) {
				System.out.println("❌ Sheet name " + sheetName + " not found in file:" + excelPath);
			}
			System.out.println("✔ Excel file loaded successfully");
	        System.out.println("✔ Sheet selected: " + sheet.getSheetName());
		}
		catch(FileNotFoundException e) {
			System.out.println("❌ Excel file not found at path: " + excelPath);
		}catch (IOException e) {
	        System.out.println("❌ Error while reading Excel file: " + e.getMessage());
	    }
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//Get Row Index by test case ID
	public static int getRowIndexByTestCaseID(String testCaseID) {
		int row = sheet.getPhysicalNumberOfRows();
		for(int i =0; i < row; i++) {
			Cell cell = sheet.getRow(i).getCell(0);
			if(cell.getStringCellValue().trim().equals(testCaseID)) {
				return i;
			}
		}
		return -1;
		
	}
	
	//Get Cell Data by ColumnHeader
	public static int getcellDataByHeadernName(String headerName) {
		
		Row row = sheet.getRow(0);
		for(int i = 0; i< row.getLastCellNum(); i++) {
			if(row.getCell(i).getStringCellValue().trim().contains(headerName)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static String getData(String testCaseID, String columnName) {
		int rowIndex = getRowIndexByTestCaseID(testCaseID);
		int columnHeader = getcellDataByHeadernName(columnName);
		if(rowIndex == -1 || columnHeader == -1) {
			return "Data Not Found";
		}else {
		return sheet.getRow(rowIndex).getCell(columnHeader).getStringCellValue();
	}}
	
}

/* 
package utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    private static Workbook workbook;
    private static Sheet sheet;

    public static void setExcelFile(String excelPath, String sheetName) {
        try {
            FileInputStream fis = new FileInputStream(excelPath);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get column number based on header name
    public static int getColumnIndex(String columnName) {
        Row headerRow = sheet.getRow(0);
        for (int i = 0; i < headerRow.getLastCellNum(); i++) {
            if (headerRow.getCell(i).getStringCellValue().trim().equals(columnName)) {
                return i;
            }
        }
        return -1;
    }

    // Find row index based on TestCaseID
    public static int getRowIndexByTestCaseId(String testCaseId) {
        int rows = sheet.getPhysicalNumberOfRows();
        for (int i = 1; i < rows; i++) {
            Cell cell = sheet.getRow(i).getCell(0);
            if (cell.getStringCellValue().trim().equals(testCaseId)) {
                return i;
            }
        }
        return -1;
    }

    // Get value from TC ID + Column Name
    public static String getData(String testCaseId, String columnName) {
        int rowIndex = getRowIndexByTestCaseId(testCaseId);
        int colIndex = getColumnIndex(columnName);
        if (rowIndex == -1 || colIndex == -1) {
            return "Data not found!";
        }
        return sheet.getRow(rowIndex).getCell(colIndex).getStringCellValue();
    }
}
*/
