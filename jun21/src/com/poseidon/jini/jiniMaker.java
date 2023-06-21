package com.poseidon.jini;

import java.util.Scanner;
//
// jar
// java class jar
public class jiniMaker {
	public static void main(String[] args) {
		
		JINI jini = new JINI();
		Scanner sc = new Scanner(System.in);
		// 그만 / 안녕 / 시간 / 이제 그만 / 잘자 / 나가기
		while (jini.isQute) {
			System.out.print("단어 입력 : ");
			String input = sc.next();
			jini.scheck(input);
		}
		
		sc.close();
	}
}
