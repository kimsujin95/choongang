package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Excel02 {
	public static String filePath = "c:\\temp";
	public static String fileNm = "Excel02.xls";
	
	public static void main(String[] args) {
		// 빈 Workbook 생성
//		XSSFWorkbook workbook = new XSSFWorkbook();
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 빈 Sheet를 생성
//		XSSFSheet sheet = workbook.createSheet("직원데이터");
		HSSFSheet sheet = workbook.createSheet("직원데이터");
		
		// Sheet를 채우기 위한 데이터들을 Map에 저장한다.
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("5", new Object[] {"4", "소금빵", "010-5000-5907"});
		data.put("3", new Object[] {"2", "식빵", "010-8966-5658"});
		data.put("1", new Object[] {"ID", "Name", "전화번호"});
		data.put("2", new Object[] {"1", "쿠키", "010-4521-5698"});
		data.put("4", new Object[] {"3", "마카롱", "010-8700-4519"});
		
		// data에서 keySet을 가져옵니다. 이 set값들을 조회해서 sheet에 입력한다.
		Set<String> keyset = data.keySet();
		int rownum = 0;
		
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				// ctrl + space하고 두번째 꺼 Cell import
				Cell cell = row.createCell(cellnum++);
				// String (문자열) 타입인지
				if (obj instanceof String) {
					cell.setCellValue((String)obj);
					// Integer (정수) 타입인지
				} else if (obj instanceof Integer) {
					cell.setCellValue((Integer)obj);
				}
			}
		}
		
		try {
			
			FileOutputStream out = new FileOutputStream(new File(filePath, fileNm));
			workbook.write(out);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
}
