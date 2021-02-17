package readexel;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExlFiles {

    public static void main(String [] args) throws IOException {

                String filepath = "..\\PracticeHellowWorld\\datafiles\\Countries.xlsx";
                FileInputStream readfile = new FileInputStream(filepath);
                XSSFWorkbook workbook = new XSSFWorkbook(readfile);
                XSSFSheet sheet = workbook.getSheet("Sheet1");
                //Using for loop

                int rows = sheet.getLastRowNum();
                int col = sheet.getRow(0).getLastCellNum();

                for(int r=0; r<=rows; r++) {

                    XSSFRow row = sheet.getRow(r);

                    for(int c=0; c<col; c++) {

                        XSSFCell cell=row.getCell(c);
                        switch(cell.getCellType()) {

                            case STRING: System.out.print(cell.getStringCellValue()); break;
                            case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
                            case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
                        }

                        System.out.print(" | ");
                    }


                    System.out.println();

                }


            }

        }



