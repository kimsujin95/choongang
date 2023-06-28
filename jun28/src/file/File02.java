package file;

import java.io.FileWriter;
import java.io.IOException;

// 기존 파일에 이어서 저장하기.
public class File02 {
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("c:\\temp\\fileWriter.txt", true);
			for (int i = 0; i < 10; i++) {
				String data = i + "번째 이어서 씁니다.\n";
				fw.write(data);
			}
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
//			e.printStackTrace();
		}
		
	}
}
