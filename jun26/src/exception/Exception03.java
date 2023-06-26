package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 예외처리하기
public class Exception03 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		try {
			// 파일 경로는 역슬래시 2번 입력한다.
			fr = new FileReader("c:\\temp\\temp.txt");
//			fr = new FileReader("c:/temp/temp.txt");
			System.out.println("파일이 있습니다.");

			// 진짜 파일 내용 읽어오기
			int data;
			
			while (true) {
				data = fr.read(); // 글자 하나 / 읽을 글자가 없다면 -1
				if (data == -1) { // 읽어올 데이터가 없다면
					break; // 종료
				}
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("파일이 없습니다. 확인해주세요.");
		// else if같은 구문
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		} finally { // 예외 발생 유무와 상관없이 반드시 실행할 문장이다.
			// 닫기 명령문
			try {
				fr.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
