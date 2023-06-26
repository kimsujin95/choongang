package collec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

// DTO 파일 전송 객체(Data Transfer Object)
class BoardDTO {
	int bNo;	// 번호
	String bTitle;	// 제목
	String bWriter;	// 작성자
	int bRead;	// 조회수
	String bDate;	// 날짜
	
	BoardDTO(int bNo, String bTitle, String bWriter, int bRead, String bDate) {
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bRead = bRead;
		this.bDate = bDate;
	}
}


public class Vector01 {
	public static void main(String[] args) {
		
		Vector<BoardDTO> board = new Vector<BoardDTO>();
		
		board.add(new BoardDTO(10, "고양이의 삶10", "김수진", 56, "16:27"));
		board.add(new BoardDTO(9, "고양이의 삶9", "정준식", 35, "16:28"));
		board.add(new BoardDTO(8, "고양이의 삶8", "이상화", 111, "16:29"));
		board.add(new BoardDTO(7, "고양이의 삶7", "김민성", 8, "16:30"));
		board.add(new BoardDTO(6, "고양이의 삶6", "박지윤", 99, "16:31"));
		board.add(new BoardDTO(5, "고양이의 삶5", "최지은", 24, "16:32"));
		board.add(new BoardDTO(4, "고양이의 삶4", "박채아", 80, "16:33"));
		board.add(new BoardDTO(3, "고양이의 삶3", "황선우", 75, "16:34"));
		board.add(new BoardDTO(2, "고양이의 삶2", "정대규", 202, "16:35"));
		board.add(new BoardDTO(1, "고양이의 삶1", "구관모", 62, "16:36"));
		board.add(new BoardDTO(34, "강아지의 삶", "김수진", 3478, "2023-06-22"));
		
		System.out.println("==================================================");
		System.out.println("번호 \t 제목 \t\t 글쓴이 \t 조회수 \t 날짜");
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < board.size(); i++) {
			BoardDTO ele = board.get(i);
			System.out.printf("%d \t %s \t %s \t %d \t %s\n", ele.bNo, ele.bTitle, ele.bWriter, ele.bRead, ele.bDate);
		}
		System.out.println("==================================================");

	}
}
