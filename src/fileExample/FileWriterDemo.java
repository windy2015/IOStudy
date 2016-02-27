package fileExample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 测试FileWriter和FileReader
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>succez</p>
 * @author John
 * @createdate 2016年2月2日
 */
public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		String sourceFile ="D:\\io\\test.txt";;
		String targetFile ="D:\\io\\test1.txt";
		FileReader fr = new FileReader(sourceFile);
		FileWriter fw = new FileWriter(targetFile);
		char[] buf = new  char[8*1024];
		int b;
		while((b=fr.read(buf, 0, buf.length))!=-1){
			fw.write(buf, 0, b);
			fw.flush();
		}
		fr.close();
		fw.close();
	}

}
