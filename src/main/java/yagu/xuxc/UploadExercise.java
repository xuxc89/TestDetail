///**
// * @author xuxc
// * @since 2017年5月20日 上午9:33:23
// */
//package yagu.xuxc;
//
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.URLEncoder;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFCellStyle;
//import org.apache.poi.hssf.usermodel.HSSFFont;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.hssf.util.CellRangeAddress;
//import org.apache.poi.hssf.util.HSSFColor;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * @author xuxc
// * @since 2017年5月20日 上午9:33:23
// */
//
//public class UploadExercise {
//    @Autowired
//    private HttpServletResponse response;
//
//    @Test
//    public void test() {
//        
//    }
//    
//    
//    private void responce() {
//        /*
//        * 将数据放入excel表中
//        */
//        //1.创建一个excel对象
//        HSSFWorkbook excel = new HSSFWorkbook();
//        //2.样式
//        //单元格样式
//        HSSFCellStyle cellStyle = excel.createCellStyle();
//        HSSFCellStyle fontStyle = excel.createCellStyle();
//        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);//创建一个居中样式
//        //字体样式
//        HSSFFont font = excel.createFont();
//        font.setColor(HSSFColor.RED.index);
//        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
//        fontStyle.setFont(font);
//        fontStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);//创建一个居中样式
//        //2.在excel中添加一个sheet
//        HSSFSheet sheet = excel.createSheet("帮扶记录");
//        //3.在sheet中添加第0行:标题（xx的帮扶记录情况）
//        HSSFRow row = sheet.createRow(0);
//        HSSFCell cell = row.createCell(0);
//        cell.setCellValue(rkxx.getStr("XM")+"的帮扶记录情况");
//        cell.setCellStyle(fontStyle);
//        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 6));//合并7列成一列，放大标题(起始行，截至行，起始列， 截至列)
//        //4.创建单元格，设置表头，以及表头样式
//        //创建第二行，开始写表头
//        row = sheet.createRow(1);
//        //第一列
//        cell = row.createCell(0);
//        cell.setCellValue("序号");
//        cell.setCellStyle(cellStyle);
//        //第二列
//        cell = row.createCell(1);
//        cell.setCellValue("帮扶人员");
//        cell.setCellStyle(cellStyle);
//        //第三列
//        cell = row.createCell(2);
//        cell.setCellValue("帮扶人联系电话");
//        cell.setCellStyle(cellStyle);
//        //第四列
//        cell = row.createCell(3);
//        cell.setCellValue("帮扶时间");
//        cell.setCellStyle(cellStyle);
//        //第五列
//        cell = row.createCell(4);
//        cell.setCellValue("帮扶内容");
//        cell.setCellStyle(cellStyle);
//        //第六列
//        cell = row.createCell(5);
//        cell.setCellValue("帮扶结果");
//        cell.setCellStyle(cellStyle);
//        //第七列
//        cell = row.createCell(6);
//        cell.setCellValue("帮扶单位");
//        cell.setCellStyle(cellStyle);
//
//        //5.写入数据
//        for (int i = 0; i < bfjl.size(); i++) {
//        //在excel中新增一行
//        row = sheet.createRow(i + 2);//标题占一行，表头已占一行，故从第三行开始添加数据
//        //在新增的一行中，依次创建单元格放入上面定义的列值
//        row.createCell(0).setCellValue(i+1);//序号
//        row.createCell(1).setCellValue(bfjl.get(i).getStr("BFRY"));//帮扶人员
//        row.createCell(2).setCellValue(bfjl.get(i).getStr("BFRLXDH"));//帮扶人联系电话
//        row.createCell(3).setCellValue(bfjl.get(i).getTimestamp("BFSJ").toString());//帮扶时间
//        row.createCell(4).setCellValue(bfjl.get(i).getStr("BFNR"));//帮扶内容
//        row.createCell(5).setCellValue(bfjl.get(i).getStr("BFJG"));//帮扶结果
//        row.createCell(6).setCellValue(bfjl.get(i).getStr("BFDW"));//帮扶单位
//        }
//        //6.将其生成一个excel文件，输出
//        //String name = PathKit.getWebRootPath()+"/download/"+rkxx.getStr("xm")+".xls";
//        String name =rkxx.getStr("xm")+".xls";
//        try {
//        //在本地生成一个excel文件，在传
//        /*File file = new File(name);
//        FileOutputStream file1 = new FileOutputStream(file);
//        excel.write(file1);
//        file1.close();*/
//        //直接获取输出，直接输出excel（优先使用）
//        OutputStream output=response.getOutputStream();
//           response.reset();
//           response.setHeader("Content-disposition", "attachment; filename="+ URLEncoder.encode(name, "utf-8"));
//           response.setContentType("application/msexcel");        
//           excel.write(output);
//           output.close();
//        } catch (FileNotFoundException e) {
//        e.printStackTrace();
//        } catch (IOException e) {
//        e.printStackTrace();
//        }
//    }
//    
//    private void file(String path) {
//        File file = new File(path);
//        try {
//            FileInputStream inputStream = new FileInputStream(file);  
//            BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
//            out.write(inputStream.read());
//            out.flush();
//            out.close();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        
//    }
//}
