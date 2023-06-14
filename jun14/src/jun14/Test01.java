package jun14;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		1번 문제
		
//		1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
//
//		8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
//		(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
		
		String cnt = "";
		int num = 0;
		int m;
		for (m = 0; m <= 10000; m++) {
			cnt = Integer.toString(m);
			for (int i = 0; i < 10; i++) { // 1000
				for (int i2 = 0; i2 < 10; i2++) { // 100
					for (int j = 0; j < 10; j++) { // 10
						for (int j2 = 0; j2 < 10; j2++) { // 1
							if (i == 8 || i2 == 8 || j == 8 || j2 == 8) {
								num += m;
							}	
						}
					}
				}
			}
		}
//		System.out.println(num);	
		int count = 0;
		for(int i = 1; i <= 10000; i++)
		{
		    for(int j = i; j > 0; j /= 10)
		    {
		        if(j % 10 == 8)
		        {
		            count++;
		        }
		    }
		}
		System.out.println(count);
		
//		2번 문제
		
//		문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
//		입력 예시: aaabbcccccca
//		출력 예시: a3b2c6a1	
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자를 입력하세요. : ");
		String input = sc.nextLine();
		
		String anw = "";
		int count1 = 1;
        
		for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count1++;  
            } else {
                anw += input.charAt(i) + (count1 + " ");
                count1 = 1;
            }
        }	
		System.out.println(anw);
//		int sum = 0;
//		char[] chInput = input.toCharArray();
//		
//		for (int i = 0; i < chInput.length; i++) {
//			// 입력한 첫 문자와 그 다음 문자를 비교했을 때 
//			if (chInput[i] == chInput[i + 1]) {
//				// sum 증가
//				sum++;
//			} else { // 더 이상 글자가 맞지 않을 때 
//				System.out.print(chInput[i] + sum + ""); // 첫 글자 앞에 
//				for (int j = i + 1; j < chInput.length - 1; j++) {
//					// 
//					if (chInput[j] == chInput[j + 1]) {
//						sum++;
//					} else {
//						System.out.print(chInput[j] + sum);
//					}
//				}
//			}		
//		}
		
		
//		3번 문제
		
//		문자열 형식으로 입력 받은 모스코드(dot: . dash:-)를 해독하여 영어 문장으로 출력하는 프로그램을 작성하시오.
//		글자와 글자 사이는 공백 하나, 단어와 단어 사이는 공백 두개로 구분한다.
//		예를 들어 다음 모스부호는 "he sleeps early"로 해석해야 한다.
//		.... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		String inp =scan.nextLine();
		
		System.out.println(inp);
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
// 가위바위보 게임을 만들어 주세요.
// 1. 10번 게임을 합니다.
// 2. 사용자가 1.가위, 2.바위, 3.보 중 하나 선택
// 3. 컴퓨터는 랜덤으로 1 ~ 3을 뽑아서 비교하기.
// 4. 승패를 저장합니다.
// 5. 10번 게임이 끝나면 승률을 출력해주세요.
// 예) 5승 2패 3비김 승률 : 75%
		
		int kh = 0;
		int bh = 0;
		int vh = 0;
		
		int kc = 0;
		int bc = 0;
		int vc = 0;
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("가위바위보~! 시작");
		
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "번째 시합");
			System.out.print("사람 : ");
			String input1 = sc1.nextLine();
			
			System.out.print("컴퓨터 : ");
			int input2 = (int) (Math.random() * 2) + 1;
			
			switch (input1) {
			case "가위" :
				kh = 1;
				break;
			
			case "바위" :				
				bh = 2;
				break;
								
			case "보" :
				vh = 3;
				break;
			
			default :
				System.out.println("다시 승부");
				return;
			}
			
			switch (input2) {
			case 1 :
				System.out.println("가위");
				kc = 1;
				break;
			
			case 2 :
				System.out.println("바위");
				bc = 2;
				break;
								
			case 3 :
				vc = 3;
				System.out.println("보");
				break;
			
			default :
				System.out.println("다시 승부");
				break;
			}
			
			// 바위
			if (kh < bc) {
				win++;	// 이김
			} else if (kh == bc) {
				draw++;	// 비김
			} else {
				lose--;	// 짐
			}
			
			// 보
			if (bh < vc) {
				win++;
			} else if (bh == vc) {
				draw++;
			} else {
				lose--;
			}
			
			// 가위
			if (vh < kc) {
				win++;
			} else if (vh == kc) {
				draw++;
			} else {
				lose--;
			}
			
		}
		sc.close();
		System.out.println("게임 끝");
		System.out.println(win + "승 " + Math.abs(lose) + "패 " + draw + "비김\t" + "승률 : " + ((win / 10) * 100) + "%");
	}
}
