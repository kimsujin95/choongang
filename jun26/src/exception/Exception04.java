package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 예외처리
/* 
 * try를 활용하여 오류를 막고 다른 부분까지 실행되게 할 수 있습니다.
 * 
 * 처리방법
 * 1. 직접처리
 * 		try {
 * 			Exception이 발생할 코드
 * 		} catch(Exception e) {
 * 			예외가 발생하면 실행할 코드
 * 		} finally {
 * 			예외 발생여부와 상관없이 공통적으로 실행할 코드
 * 		}
 * 		
 * 2. 던지기 (Throw) 
 * 		메소드 뒷 부분에 throw 처리할 타입을 적어줍니다.
 * 		메소드가 실행되다가 예외를 만나면 메소드를 호출한 쪽으로
 * 		예외를 던집니다.
 * 		이 던지기가 main메소드까지 온다면 VM으로 던지고 강제 종료됩니다.
 * 		
 * 		
 * 3. 직접 Exception객체를 만들어서 처리하기
 * 		예외 객체를 만들어서 처리하기	
 * 		throw 객체명;
 * 
 * 			@override
 * 			public void printStrackTrace() {
 * 				System.out.print("예외가 발생했습니다.");
 * 				super.printStackTrace();
 * 			}
 * 
 * 
 */
public class Exception04 {
	public static void main(String[] args) {
		
		int [] arr01 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		try {
			System.out.println(arr01[arr01.length]);		
//			System.out.println("이 출력문은 볼 수 없습니다.");
			System.out.println("이제 이 문장을 볼 수 있어요");
			// 0으로 나눌수는 없다. → 컴파일 에러가 난다.
			System.out.println(arr01[0] / 0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 밖으로 나갔어요.");
		} catch (ArithmeticException e) {
			// 계산 오류 예외 처리
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("예외 발생 유무와 상관없이 실행합니다.");
		}
		////////////////
		// 파일 없음 오류
		Scanner sc = new Scanner(System.in);
		System.out.print("c:\\temp\\temp.txt라고 입력하세요. : ");
		
		try {
			String file = sc.next();
			FileReader fr = new FileReader(file);			
			System.out.println("파일 있음.");
			
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음.");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("닫아 주기.");
//			e.printStackTrace();
		} finally {
			// 마지막에 오픈한 객체부터 닫아주세요.
			sc.close();
		}
		
		System.out.println("프로그램 종료");			
		
	}
}
