package org.alpha.sanjeevani.testngconcepts.parameterization;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataByIterator {
    @DataProvider(name = "getDataFromExcel")
    public Iterator<Object[]> getDataFromExcel() throws IOException, InvalidFormatException {
        File file = new File("C:\\Users\\Dell\\corejava-selenium-jan2024\\src\\main\\java\\org\\alpha\\sanjeevani\\testngconcepts\\parameterization\\loginData.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("sheet1");

        String data00 = sheet.getRow(0).getCell(0).getStringCellValue();
        String data01 = sheet.getRow(0).getCell(1).getStringCellValue();
        String data02 = sheet.getRow(0).getCell(2).getStringCellValue();

        String data10 = sheet.getRow(1).getCell(0).getStringCellValue();
        String data11 = sheet.getRow(1).getCell(1).getStringCellValue();
        String data12 = sheet.getRow(1).getCell(2).getStringCellValue();

        String data20 = sheet.getRow(2).getCell(0).getStringCellValue();
        String data21 = sheet.getRow(2).getCell(1).getStringCellValue();
        String data22 = sheet.getRow(2).getCell(2).getStringCellValue();
        System.out.println(data00);
        System.out.println(data01);
        System.out.println(data02);
        System.out.println(data10);
        System.out.println(data11);
        System.out.println(data12);
        System.out.println(data20);
        System.out.println(data21);
        System.out.println(data22);

        Object[] objArr1={data00,data01,data02};
        Object[] objArr2={data10,data11,data12};
        Object[] objArr3={data20,data21,data22};

        List<Object[]> list = new ArrayList();
        list.add(objArr1);
        list.add(objArr2);
        list.add(objArr3);

       Iterator<Object[]>itr = list.iterator();

       return itr;
    }

}
