package file;

import java.io.FileWriter;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("c:\\temp\\fileWriter.txt");
			for (int i = 0; i < 10; i++) {
				String data = i + "번째 글을 씁니다\n";
				fw.write(data);
			}
			
			fw.flush();
			fw.close();
			
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}
}
