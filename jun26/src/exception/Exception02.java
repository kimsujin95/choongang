package exception;
// 예외처리하기
public class Exception02 {
	public static void main(String[] args) {
		
		try {
			
			Class clazz = Class.forName("java.lang.String");
			System.out.println("윗 문장이 예외가 발생하지 않으면 실행");
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		}
		System.out.println("try ~ catch블러 끝. 정상 종료");
	}
}
