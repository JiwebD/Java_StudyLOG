package Ch19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriteMain {

	public static void main(String[] args) throws IOException {
//		Writer fout = new FileWriter("C:\\IOTEST\\test1.txt",false);	//덮어쓰기
		Writer fout = new FileWriter("C:\\IOTEST\\test1.txt",true);		//추가하기
		fout.write("TEST5\n");
		fout.write("TEST6\n");
		fout.write("TEST7\n");
		fout.write("TEST8\n");
		
		fout.flush();
		fout.close();
	}

}
