package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadExcel {
	File src;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	FileOutputStream fso;

	public LoadExcel() {
		src = new File("E:\\JavaPractice\\Think.Agency.Atlas.Artifact.ID\\TestData\\TestData.xlsx");
		try {
			FileInputStream fin = new FileInputStream(src);
			wb = new XSSFWorkbook(fin);

		} catch (Exception e) {
			System.out.println("****Error in loading excel in class 'LoadExcel'****" + e.getMessage());
		}

	}

	public String readExcelSheet(int sheetIndex, int rownum, int colnum) {
		sheet = wb.getSheetAt(sheetIndex);
		return sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	}

	public void writeExcel(int sheetIndex, int rownum, int cellnum, String data) {
		sheet = wb.getSheetAt(sheetIndex);
		sheet.getRow(rownum).createCell(cellnum).setCellValue(data);

		try {
			fso = new FileOutputStream(src);
			wb.write(fso);

		} catch (Exception e) {
			System.out.println("****Error in loading excel in class 'WriteExcel'****" + e.getMessage());
		}

	}
}
