package com.ihyht.alyxjs.kfzpt.portal.utils;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.List;

public class ExcelUtil {

    //, HttpServletResponse response
    public static boolean exportExcel(String fileName, List<String> titleName, List<String> dataList,
                                      HttpServletResponse response) {


        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("吴彦祖");


        String fileName2 = "测试";
        try {


            response.reset();
            response.setContentType("application/vnd.ms-excel; charset=utf-8");
            response.setHeader("Content-Disposition",
                    "attachment; filename=" + fileName2 + ".xls");
            response.flushBuffer();
            OutputStream output = response.getOutputStream();
//            response.setHeader("Access-Control-Allow-Origin", "http://***:8001");//解决跨域
            try {

                workbook.write(output);
            } catch (Exception e) {
                e.printStackTrace();
            }

            output.flush();
            try {
                output.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }


}
