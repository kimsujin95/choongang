package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws IOException {
		
		File dir = new File("c:\\temp\\images");
		File file1 = new File("c:\\temp\\file1.txt");
		File file2 = new File("c:\\temp\\file2.txt");
		File file3 = new File("c:\\temp\\file3.txt");
		
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		if (!file1.exists()) {
			file1.createNewFile();
		}
		
		if (!file2.exists()) {
			file2.createNewFile();
		}
		
		if (!file3.exists()) {
			file3.createNewFile();
		}
	
		File temp = new File("c:\\temp");
		File[] contents = temp.listFiles();

		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("----------------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm"); // 초 빼시면 정렬됩니다.
		
		System.out.println(Arrays.toString(contents));
		System.out.println(contents[4].getName()); // 파일명
		System.out.println(contents[4].length()); // 파일 용량
		System.out.println(contents[4].isDirectory()); // 파일인지 존재 유무
		
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
		
			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}
}
