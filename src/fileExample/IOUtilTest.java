package fileExample;

import java.io.IOException;

public class IOUtilTest {

	public static void main(String[] args) {
		String fileName = "d:\\io\\ioutil.txt";
		try {
			IOUtil.writeHex(fileName);
		}
		catch (IOException e) {			
			System.out.println("文件不存在");
		}

	}

}
