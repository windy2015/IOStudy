package fileExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader 测试
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>succez</p>
 * @author John
 * @createdate 2016年2月2日
 */
public class WriterImpl {

	public static void main(String[] args) throws IOException {
		String path ="D:\\io\\test.txt";
		FileInputStream ins = new FileInputStream(path);
		InputStreamReader inr = new InputStreamReader(ins);//默认是gbk编码
		char[] buf = new char[8*1024];
		int b;
		while((b=inr.read(buf, 0, buf.length))!=-1){
			String s = new String(buf, 0, b);
			System.out.println("test is "+s);			
		}
		inr.close();
	}

}
