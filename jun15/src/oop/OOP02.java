package oop;
/* 자바의 메소드 = function = func(){}
 * 자바는 클래스를 정의하고 정의된 클래스의 인스턴스를 만들어서
 * 여러가지 기능적인 일을 처리하도록 만들어진 객체지향언어입니다.
 * 
 * 위에서 기능적인 일을 담당하는 것이 메소드 입니다.
 * 메소드는 우리가 산수시간에 배웠던 함수와 같은 개념입니다.
 * 
 * 즉 특정 기능(일)을 수행하도록 메소드에서 미리 정의하고
 * 그 일이 필요할 때마다 해당 메소드를 호출해서 사용합니다.
 * 
 * 이렇게 하는 주 이유는 같은 일을 수행하는 것을 반복적으로
 * 코딩하지 않아도 되는 큰 이점이 있기 때문입니다.
 * 
 * 메소드의 기본 형식
 * 		[접근제어자] 리턴타입 메소드명 ([파라미터, ...]) {
 * 				구현부 : 메소드가 하는 일 = 명령어의 집합
 * 		}
 * 
 * []는 없어도 되는 부분입니다. 나머지는 필수입니다.
 * 
 * 
 * 메소드의 리턴 타입은 크게 두 가지로 나뉩니다.
 * 리턴할 내용이 없을 때는 void라고 적어줍니다.
 * 
 * 만약 리턴할 내용이 있다면 반환되는 데이터의 데이터 타입을 void자리에
 * 적어야 합니다.
 * 명령문 끝에 return이라고 적고 반환할 데이터를 적어줍니다.
 * (기본자료형 / 참조 자료형이나 공통)
 * 
 * void타입의 리턴일 때는 메소드가 값을 리턴하게 됩니다.
 * 이럴 때는 에러가 납니다.
 * 
 * 메소드 실행 중 리턴이 된다면 리턴 이후의 코드는 무시됩니다.
 * 
 */

class Animal {
	// 빵 만들기 : 입력된 숫자만큼 화면에 "빵을 만듭니다"라고 출력하고
	// 그 갯수를 리턴하는 메소드 makeBread(5)
	
	int makeBread(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("빵을 만듭니다.");
		}
		
		return num;
	}
	
	int fac(int num) { // 5! = 5 * 4 * 3 * 2 * 1
//		int result = 1;
		int result = num;
//		for (int i = 1; i <= num; i++) {
		for (int i = num - 1; i > 0; i--) {
			result *= i;
		}
		return result; 
		
	}
	
	int add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("두 타입이 일치해야 합니다.");
		return result;
	}
	
	void sleep() { // 반환타입 : void 메소드명은 뭔지 : sleep 파라미터 : 없음
		System.out.println("Zzzzzzz......."); 
	}
								
	void work(String[] arr01) {	// 반환타입 : void 메소드명은 뭔지 : work 파라미터 : arr01 문자열배열
		
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
	}
}

public class OOP02 { // 사용 10
	public static void main(String[] args) { // {"사과", "배"}
//		Animal animal = new Animal();
//		String[] arraSTR = {"고양이", "개", "쥐", "토끼", "사슴", "호랑이"};
//		animal.work(arraSTR);
	
		// args 출력
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		if (args[0].equals("사용")) {
			
			System.out.println("args를 사용합니다.");
			for (int i = 0; i < Integer.parseInt(args[1]); i++) {
				System.out.println(i + 1 + "번 반복합니다.");
			}
			
		} else {
			System.out.println("옵션이 없어서 프로그램을 종료합니다.");
		}
		
		System.out.println("/////////////////////");
		String[] arr = new String[3];
		arr[0] = "사용";
		arr[1] = "10";
		arr[2] = "fffff";
		
		//int number = arr[1];
		int number = Integer.parseInt(arr[1]);
		boolean ch = Boolean.parseBoolean(arr[2]); // "true" / "TRUE" 참
		
		boolean ch1 = arr[2].equals("true") ? true : false;
		
//		System.out.println(number);
//		System.out.println(ch);
//		System.out.println(ch1);

		System.out.println("리턴타입 연습");
		Animal animal = new Animal();
		// int result = animal.add(10, 20);
		System.out.println(animal.add(10, 20));
		
		System.out.println(animal.fac(6));
		
		System.out.println(animal.makeBread(5));
		
		
	}
}
