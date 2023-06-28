package iotest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class WrtieExample03 {
	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("c:\\temp\\write.txt");
		char arr[] = {'A', 'B', 'C', 'D', 'E'};
		
		writer.write(Arrays.toString(arr) + "\n");
		writer.write("안녕하세요.\n");
		writer.write("고생이 많으십니다.\n");
		writer.write("String도 됩니다.\n");
		writer.write("각각 엔터표시는?\n");
		writer.write("엔터가 없어졌어요.");
		
		writer.flush();
		writer.close();
	}
}
