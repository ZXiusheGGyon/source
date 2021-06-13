package com.idp.common.util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.idp.web.sourcecode.entity.PdSourceCode;
import com.idp.web.sourcecode.entity.PdSourceMsg;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 * author hs
 * 里面有两种生成Excel的方式
 * 在小数据量时jxl快于poi，在大数据量时poi要快于jxl。但差距都不明显。
 */
public class PoiExcelUtil {
    public static void createPoiExcel(List<PdSourceCode> pdSourceCodes, PdSourceMsg pdSourceMsg) throws IOException {
        // 创建工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 创建工作表
        HSSFSheet sheet = workbook.createSheet("source_code");

//        for (int row = 0; row < 8; row++) {
//            HSSFRow rows = sheet.createRow(row);
//            for (int col = 0; col < Math.ceil(pdSourceCodes.size()/8); col++) {
//                sheet.setColumnWidth(row, 7000);
//                // 向工作表中添加数据
//                rows.createCell(col).setCellValue(pdSourceCodes.get(col).getGoodsCode());
//            }
//        }
        int col = 0, row = 0;
        HSSFRow rows = null;
        for (int i = 0; i < pdSourceCodes.size(); i++) {
            col = 0;
            rows = sheet.createRow(row);
            rows.createCell(col).setCellValue(pdSourceCodes.get(i).getGoodsCode());
            row++;
            String[] levels = pdSourceMsg.getPackagingProportion().split(":");
            for (int k = 1; k < levels.length; k++) {
                if(k == levels.length - 1) {
                    for (int j = 0; j < Integer.parseInt(levels[k]); j++) {
                        if ((col) % 10 == 0) {
                            rows = sheet.createRow(row);
                            row++;
                            col = 0;
                        }
                        rows.createCell(col).setCellValue(123456);
                        col++;
                    }
                }else{
                    col = 0;
                    rows = sheet.createRow(row);
                    rows.createCell(col).setCellValue(789456);
                    row++;
                }
            }
        }

        File xlsFile = new File("D://poi.xls");
        FileOutputStream xlsStream = new FileOutputStream(xlsFile);
        workbook.write(xlsStream);
        xlsStream.close();
    }


    public static void createJxlExcel(List<PdSourceCode> pdSourceCodes) throws IOException, WriteException
    {
        File xlsFile = new File("D://jxl.xls");
        // 创建一个工作簿
        WritableWorkbook workbook = Workbook.createWorkbook(xlsFile);
        // 创建一个工作表
        WritableSheet sheet = workbook.createSheet("sheet1", 0);
        for (int row = 0; row < 10; row++)
        {
            for (int col = 0; col < Math.ceil(pdSourceCodes.size()/10); col++) {
                // 向工作表中添加数据
                sheet.addCell(new Label(col, row, pdSourceCodes.get(col).getGoodsCode()));
            }
        }
        workbook.write();
        workbook.close();
    }
}
