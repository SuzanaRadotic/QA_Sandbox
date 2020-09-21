package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * Class used to read data from excel
 */
public class ExcelReader {
    private String filePath = "./src/main/resources/";


    /**
     * Method returns cell value for specified Excel file, row, column and sheet
     *
     * @return value
     */

    public String readCellData(String fileName, int vRow, int vColumn, int sheetIndex)
    {

        String value = null;
        Workbook workbook = null;
        try
        {
            FileInputStream file = new FileInputStream(filePath + fileName);
            workbook = new XSSFWorkbook(file);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }

        Sheet sheet = workbook.getSheetAt(sheetIndex);
        Row row = sheet.getRow(vRow);
        Cell cell = row.getCell(vColumn);
        value = cell.getStringCellValue();
        return value;
    }


    /**
     * Method returns list of cell values in specified row and column throughout Excel sheets
     *
     * @return ArrayList<String>
     */

    public ArrayList<String> getCellOfAllSheets (String fileName, int row, int cell) throws IOException {
        File file = new File(filePath + fileName);

        Workbook workbook = new XSSFWorkbook(new FileInputStream(file));
        ArrayList<String> rows = new ArrayList<>(workbook.getNumberOfSheets());
        for (int numberOfSheet = 0; numberOfSheet < workbook.getNumberOfSheets(); numberOfSheet++) {
            Sheet sheet = workbook.getSheetAt(numberOfSheet);
            rows.add(sheet.getRow(row).getCell(cell).getStringCellValue());
        }
        return rows;
    }


    /**
     * Method returns number of Excel sheets
     *
     * @return numberOfSheets
     */
    public int getNumberOfSheets (String fileName) throws IOException {
        File file = new File(filePath + fileName);

        Workbook workbook = new XSSFWorkbook(new FileInputStream(file));
        int numberOfSheets = workbook.getNumberOfSheets();
        return numberOfSheets;
    }


}
