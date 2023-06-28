package iotest;
// 배열로 읽어보기

// ctrl + shift + o
// 안쓰는 import 빼주고 필요한 import 넣어준다.
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample02 {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("c:\\temp\\test1.db");
	
		byte[] buffer = new byte[10];
		
		while (true) {
			int readByteNum = is.read(buffer, 4, 3);
			System.out.println(Arrays.toString(buffer));
			if (readByteNum == -1) {
				break;
			}
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i + 4]);
			}
		}
		is.close();
	}
}
