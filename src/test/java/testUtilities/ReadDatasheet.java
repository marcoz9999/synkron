package testUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public interface ReadDatasheet {

	static ArrayList<String> getTestCasesWithFillo() {

		ArrayList<String> testCases = new ArrayList<>();

		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(Constants.datasheetFilePath);

			String strQuery = "SELECT * FROM Data WHERE \"Execute\" = 'Y'";
			Recordset recordSet = connection.executeQuery(strQuery);

			while (recordSet.next()) {
				testCases.add(recordSet.getField("ClassName"));
			}
			System.out.print("The following tests will be performed:\n");
			for (String test : testCases) {
				System.out.println((testCases.lastIndexOf(test) + 1) + ". " + test + "\t");
			}

			recordSet.close();
			connection.close();

		} catch (FilloException e) {
			e.printStackTrace();
		}
		return testCases;
	}

	static String get(String header, String tcId) {
		String result = null;
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(Constants.datasheetFilePath);

			String strQuery = String.format("SELECT \"%s\" FROM Data WHERE \"ClassName\" = '%s'", header, tcId);
			Recordset recordSet = connection.executeQuery(strQuery);

			while (recordSet.next()) {
				result = recordSet.getField(header);
			}

			recordSet.close();
			connection.close();

		} catch (FilloException e) {
			e.printStackTrace();
		}
		return result;
	}
	static String set(String columnName,String insertText, String tcId) throws IOException {
		String result = null;
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(Constants.datasheetFilePath);
			String strQuery = String.format("UPDATE Data Set '%s' = '%s' WHERE \"ClassName\" = '%s'",columnName, insertText, tcId);
			connection.executeUpdate(strQuery);
			connection.close();

		} catch (FilloException e) {
			e.printStackTrace();
			FileInputStream file = new FileInputStream(new File(Constants.datasheetFilePath));
			Workbook workbook = new XSSFWorkbook(file);
		    Sheet datatypeSheet = workbook.getSheetAt(0);
		    Iterator<Row> iterator = datatypeSheet.iterator();

		    // Add additional column for results
		    while (iterator.hasNext()) {
		        Row currentRow = iterator.next();
		        Cell cell = currentRow.createCell(currentRow.getLastCellNum(), CellType.STRING);
		        if(currentRow.getRowNum() == 0)
		            cell.setCellValue("InsertedText");
		    }
		    FileOutputStream output_file = new FileOutputStream(new File(Constants.datasheetFilePath));
		    workbook.write(output_file);
	        workbook.close();
	        output_file.close();
	        try {
				Fillo fillo = new Fillo();
				Connection connection = fillo.getConnection(Constants.datasheetFilePath);
				String strQuery = String.format("UPDATE Data Set %s = '%s' WHERE \"ClassName\" = '%s'",columnName, insertText, tcId);
				connection.executeUpdate(strQuery);
				connection.close();

			} catch (FilloException e1) {

			}


		}
		return result;
	}
}
