package exception;

import java.io.IOException;
import java.util.Scanner;

// 자바의 예외처리 (책 453p) / 2023-06-26 / 웹 서버프로그램 구현
/* 
 * 자바에서는 예외라는 것을 두고 목적에 따라 핸들링(처리)하도록
 * 되어있습니다.
 * 
 * 예외
 * 예외는 주로 실행시에 발생되는 모든 에러 상황을 예외라고 합니다.
 * 물론 특정 API에서는 컴파일 시에 예외를 처리하지 않으면 컴파일되지
 * 않는 예외도 있습니다.
 * 
 * 예외의 정의 = 실행시에 발생할 수 있는 모든 에러상황으로 기억해주세요.
 * 
 * 자바에서는 예외가 발생하는 순서가 있습니다.
 * 컴파일 → 실행 → 실행중 예외발생 → VM이 발생된 예외의 종류 및 내용 파악
 * → 예외 객체 생성 → 발생된 코드 밖으로 예외 객체를 던짐(throw) →
 * 예외의 콜 스택에 전이 → main메소드 밖까지 던지게 되면 프로그램 강제 종료
 * 
 * 위처럼 예외는 던지다라고 표현합니다.
 * 또한 예외는 객체이기 때문에 당연히 클래스로 정의되어 있습니다.
 * 
 * 예외의 최고 클래스는 lang 패키지의 Throwable입니다.
 * 여기에 자식으로는 Error와 Exception이 있습니다.
 * Error의 하위 타입은 일반적으로 자바 실행기 즉, VM에 관련된
 * 에러 상황들을 정의한 클래스 입니다.
 * 
 * 이러한 문제(에러상황)는 프로그래머가 처리할 수 없는 것들입니다.
 * VM, JRE전체의 문제입니다.
 * 
 * 따라서 프로그래머는 Error하위 타입의 예외들(에러들)은 처리하지 않고
 * 무시합니다.(처리할 수 없습니다.)
 * 
 * Exception이란 클래스의 하위 타입이 바로 프로그래머가 처리해야 할
 * 예외 타입들 입니다.
 * 따라서 보통 예외다 라고 표현할 때 최고 클래스는 Exception클래스 입니다.
 * Throwable 클래스는 자식으로 Error를 가지고 있기 때문에 
 * 예외의 최고 클래스라고 표현하지 않습니다.
 * 
 * 예외의 종류
 * 크게 두가지로 나뉩니다.
 * 컴파일러가 관여하지 않으면서, 실행시에 예외가 발생 할 수도, 
 * 안 할 수도 있는 예외 	= 알려지지 않은 예외(UnChecked Exception)
 * 컴파일러가 관여하는 예외 = 알려진 예외(Checked Exception)
 * 
 * 구분하는 방법은 Exception 하위 클래스 중 RuntimeException이 있는데
 * 해당 클래스의 자식 클래스는 모두 알려지지 않은 예외입니다.
 * 나머지는 모두 알려진 예외입니다.
 * 
 * 
 * 
 */
public class Exception01 {
	public static void main(String[] args) {
		
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		for (int i = 1; i < arr.length; i++) {
//			System.out.printf("%d", arr[i]);
//		}
//		
//		System.out.println("프로그램 정상 종료");

		System.out.print("숫자 하나 입력하세요. : ");
		try { // 예외가 발생할 것 같은 문장
			int num = System.in.read();
			System.out.println("입력에 문제가 없으면 여기가 실행됩니다.");
			System.out.println(num);
			
		} catch (IOException e) {
			System.out.println("입출력에 문제가 발생했습니다.");
			e.printStackTrace();
		}
		
		// 여기로 
		
	}
}
