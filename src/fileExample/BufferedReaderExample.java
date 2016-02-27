package fileExample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * BufferedReader和PrintWriter配合使用
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>succez</p>
 * @author John
 * @createdate 2016年2月2日
 */
public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		String path ="d:\\io\\test.txt";
		String path1 = "d:\\io\\test1.txt";
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path1)));
		PrintWriter pw = new PrintWriter(path1);
		String result;
		while((result=br.readLine())!=null){
			//System.out.println(result);
			//bw.write(result);//无法识别换行符
			//bw.newLine();
			pw.write(result);
			pw.println();//换行
			pw.flush();
		}
		br.close();
		//bw.close();
		pw.close();
	}

}
