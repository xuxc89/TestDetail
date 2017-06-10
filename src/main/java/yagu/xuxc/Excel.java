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
		// // �½�������
		HSSFWorkbook workbook = new HSSFWorkbook();
		// ����һ�����
		HSSFSheet sheet = workbook.createSheet();
		// workbook.setSheetName(sheetNum, sheetTitle);
		// ���ñ��Ĭ���п��Ϊ17���ֽ�

		sheet.setDefaultColumnWidth(15);
		sheet.createFreezePane(4, 0); // �����У�����ǰ����
		sheet.setColumnWidth(0, 2000); // ���ÿ�� ��excel�Ŀ�ȵ�λ��ͬ��
		sheet.setColumnWidth(1, 2500);
		sheet.setColumnWidth(2, 1700);
		sheet.setColumnWidth(3, 2000);

		// ����һ����ʽ
		HSSFCellStyle style = workbook.createCellStyle();
		HSSFCellStyle style2 = workbook.createCellStyle();

		// ������Щ��ʽ
		style.setFillForegroundColor(HSSFColor.WHITE.index);// �Ը���Ԫ����ɫ
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND); // ���õ�Ԫ�������ʽ
		// SOLID_FOREGROUND��ɫʹ��ǰ����ɫ���
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN); // ���ñ߽�����͵�Ԫ�����߿�
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);// ���õ�Ԫ��Ϊˮƽ���������
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); // ���ô�ֱ����
		style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);

		// ����һ������
		HSSFFont font = workbook.createFont();
//		 font.setColor(HSSFColor.BLACK.index);
		font.setColor(IndexedColors.BLACK.getIndex());
		font.setFontName("����"); // ��������
		font.setFontHeightInPoints((short) 11); // �����ֺ�
		font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL); // ����������ʽ ������ʾ

		// ������Ӧ�õ���ǰ����ʽ
		style2.setFont(font);
		style.setFont(font);

		// ָ������Ԫ��������ʾ����ʱ�Զ�����
		style.setWrapText(true);
		style2.setWrapText(true);
		// ������������
//		HSSFRow row = sheet.createRow(0);
//		for (int i = 0; i < headers.length; i++) {
//			HSSFCell cell = row.createCell(i);
//			cell.setCellStyle(style);
//			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
//			cell.setCellValue(text.toString());
//		}
//		// �����������ݣ�����������
//		if (result != null) {
//			int index = 1;
//			int fieldLength = new ExportBean().getClass().getDeclaredFields().length - 1;
//
//			for (ExportBean bean : result) {
//				row = sheet.createRow(index);
//				int cellIndex = 0;
//
//				Field[] fields = bean.getClass().getDeclaredFields(); // �����ȡֵ
//				for (int i = 1; i <= fieldLength; i++) {
//					Field f = fields[i];
//					f.setAccessible(true); // ���ÿɼ���
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
