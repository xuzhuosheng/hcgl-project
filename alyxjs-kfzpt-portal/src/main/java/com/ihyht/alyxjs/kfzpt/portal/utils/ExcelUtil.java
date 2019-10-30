package com.ihyht.alyxjs.kfzpt.portal.utils;

import com.ihyht.alyxjs.kfzpt.service.portal.rds.portal.model.QysswjXxzxTYwCgjhxq;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.List;

public class ExcelUtil {

    //, HttpServletResponse response
    public static boolean exportExcel(String fileName, List<String> titleName, List<List<String>> dataList,
                                      HttpServletResponse response) {


        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = null;

//        设置表头
        if (titleName != null) {
            for(int i = 0; i < titleName.size(); i++) {
                cell = row.createCell(i);
                cell.setCellValue(titleName.get(i));
            }

        }

        HSSFRow row2 = null;
        double sum = 0;
        if (dataList != null) {
            for(int j = 0; j < dataList.size(); j++) {
                row2 = sheet.createRow(j + 1);
                HSSFCell cell2 = null;
                for(int k = 0; k < dataList.get(j).size(); k++) {
                    cell2 = row2.createCell(k);
                    cell2.setCellValue(dataList.get(j).get(k));
                    if (k == dataList.get(j).size() - 1) {
                        sum += Double.parseDouble(dataList.get(j).get(k));
                    }
                }


            }
        }

        HSSFRow row3 = sheet.createRow(dataList.size());
        HSSFCell cell3 = row3.createCell(dataList.get(0).size() - 1);

        cell3.setCellValue(sum);

        fileName = "采购计划";
        try {


            response.reset();
            response.setContentType("application/vnd.ms-excel; charset=utf-8");
            response.setHeader("Content-Disposition",
                    "attachment; filename=" + fileName + ".xls");
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
