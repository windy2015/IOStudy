package fileExample;

import java.io.File;
import java.io.IOException;

public class IOUtilTestCopy {

	public static void main(String[] args) {
		File desFile =  new File("d:\\io\\des.txt");
		File targetFile  = new File("d:\\io\\target1.txt");
		/*
		try {
			IOUtil.copy(desFile, targetFile);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/	
		
		try {
			IOUtil.copyByBuffer(desFile, targetFile);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
