package persistent.gaja1001M;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;

public class DataDrivenTest {
  @Test
  public void ExcelDriven() throws BiffException, IOException, RowsExceededException, WriteException {
	  int rownum = 0;
	  int columnnum=0;
	  Workbook book = Workbook.getWorkbook(new File("./src/test/Names.xls"));
	  Sheet sheet1 = book.getSheet("Sheet1");
	  String names = sheet1.getCell(1, 0).getContents();
	  System.out.println(names);

	  }
	  
	  /*WritableWorkbook newbook = Workbook.createWorkbook(new File("./src/test/newExcel.xls"));
	  WritableSheet sheet1 = newbook.createSheet("Master", 2);
	  Label l1 = new Label(0, 0, "Names");
	  sheet1.addCell(l1);
	  newbook.write();
	  newbook.close();*/
	  /*Workbook oldcopy = Workbook.getWorkbook(new File("./src/test/newExcel.xls"));
	  WritableWorkbook newcopy = Workbook.createWorkbook(new File("./src/test/newerExcel.xls"));
	  */
  }

