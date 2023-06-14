package jun13;

public class Test01 {
	public static void main(String[] args) {
		// 프로그램을 실행하면 영문자대문자 + 숫자포함한 25개 key 만들기
		// 예 TC458 - 14568 - EFCVE - 15ERC - EGNCE
		// 예 EC462 - 10122 - QNRFV - 99EWW - ZNMTV
		// 예 EB050 - 69105	- PMLEP - 00MWI - LKJHF
		// 패턴 EENNN - NNNNN - EEEEE - NNEEE - EEEEE
		
		// 방법 1
//		int num = (int) (Math.random() * 1000000);
//		if ( num >= 100000 ) {
//			System.out.println(num);
//		}
		
		// 방법 2
//		for (int i = 0; i < 7; i++) {
//			i = (int) (Math.random() * 1000000);
//			if (i >= 100000) {
//				System.out.print(i);
//			}
//		}
				
		int[] pattern = new int[] {
            0, 0, 1, 1, 1, 2,
            1, 1, 1, 1, 1, 2, 
            0, 0, 0, 0, 0, 2, 
            1, 1, 0, 0, 0, 2, 
            0, 0, 0, 0, 0 
        };
      
      	for (int i = 0; i < pattern.length; i++) {
    	  	if (pattern[i] == 0) { // 영문자
        	 	System.out.print((char) (Math.random() * 26 + 65));
            
         	} else if (pattern[i] == 1) {// 숫자
         		System.out.print((int)(Math.random() * 10));
            
         	} else {// 표시
         		System.out.print(" - ");
         	}
      	}
	}
}