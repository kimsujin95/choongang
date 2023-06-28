package excel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel01 {
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
			
		WritableWorkbook workbook = null;
		WritableSheet sheet = null;
		Label label = null;
		File file = new File("c:\\temp\\excel01.xls");
		
		// HashMap으로 Map 컬렉터로 데이터값 입력한다.
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "230");
	
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("이름", "김길동");
		map2.put("나이", "20");
	
		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("이름", "김수진");
		map3.put("나이", "29");
		
		ArrayList<Map<String, String>> aList = new ArrayList<Map<String, String>>();
		aList.add(map);
		aList.add(map2);
		aList.add(map3);
		
		workbook = Workbook.createWorkbook(file);
		workbook.createSheet("시트", 0);
		sheet = workbook.getSheet(0);
		
		label = new Label(0, 0, "이름");
		sheet.addCell(label);
	
		label = new Label(1, 0, "나이");
		sheet.addCell(label);

		for (int i = 0; i < aList.size(); i++) {
			HashMap<String, String> rs = (HashMap<String, String>) aList.get(i);
			label = new Label(0, (i + 1), rs.get("이름"));
			sheet.addCell(label);
			
			label = new Label(1, (i + 1), rs.get("나이"));
			sheet.addCell(label);
		}
	
		workbook.write();
		workbook.close();
	
	}
}
