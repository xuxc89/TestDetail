package yagu.xuxc;


import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.IndexedColors;

public class Excel {
	public void test() {
		// // 新建工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 生成一个表格
		HSSFSheet sheet = workbook.createSheet();
		// workbook.setSheetName(sheetNum, sheetTitle);
		// 设置表格默认列宽度为17个字节

		sheet.setDefaultColumnWidth(15);
		sheet.createFreezePane(4, 0); // 冻结列：冻结前四列
		sheet.setColumnWidth(0, 2000); // 设置宽度 （excel的宽度单位不同）
		sheet.setColumnWidth(1, 2500);
		sheet.setColumnWidth(2, 1700);
		sheet.setColumnWidth(3, 2000);

		// 生成一个样式
		HSSFCellStyle style = workbook.createCellStyle();
		HSSFCellStyle style2 = workbook.createCellStyle();

		// 设置这些样式
		style.setFillForegroundColor(HSSFColor.WHITE.index);// 以给单元格着色
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND); // 设置单元格填充样式
		// SOLID_FOREGROUND纯色使用前景颜色填充
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN); // 设置边界的类型单元格的左边框
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 设置单元格为水平对齐的类型
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // 设置垂直居中
		style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);

		// 生成一个字体
		HSSFFont font = workbook.createFont();
//		 font.setColor(HSSFColor.BLACK.index);
		font.setColor(IndexedColors.BLACK.getIndex());
		font.setFontName("宋体"); // 设置字体
		font.setFontHeightInPoints((short) 11); // 设置字号
		font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL); // 设置字体样式 正常显示

		// 把字体应用到当前的样式
		style2.setFont(font);
		style.setFont(font);

		// 指定当单元格内容显示不下时自动换行
		style.setWrapText(true);
		style2.setWrapText(true);
		// 产生表格标题行
//		HSSFRow row = sheet.createRow(0);
//		for (int i = 0; i < headers.length; i++) {
//			HSSFCell cell = row.createCell(i);
//			cell.setCellStyle(style);
//			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
//			cell.setCellValue(text.toString());
//		}
//		// 遍历集合数据，产生数据行
//		if (result != null) {
//			int index = 1;
//			int fieldLength = new ExportBean().getClass().getDeclaredFields().length - 1;
//
//			for (ExportBean bean : result) {
//				row = sheet.createRow(index);
//				int cellIndex = 0;
//
//				Field[] fields = bean.getClass().getDeclaredFields(); // 反射获取值
//				for (int i = 1; i <= fieldLength; i++) {
//					Field f = fields[i];
//					f.setAccessible(true); // 设置可见性
//					Object val = f.get(bean);
//
//					HSSFCell cell = row.createCell(cellIndex);
//					cell.setCellValue(val.toString());
//					cell.setCellStyle(style2);
//					cellIndex++;
//				}
//				index++;
//			}
//		}
	}
}
