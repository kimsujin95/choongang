package iotest;
//1 바이트씩 출력하기

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("c:\\temp\\test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;		
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		// flush()를 호출하지 않는다면 내용이 버퍼에만 남고 파일에는 쓰이지 않는 상황이 나올 수 있습니다.
		os.flush();
		os.close();
	}
}
