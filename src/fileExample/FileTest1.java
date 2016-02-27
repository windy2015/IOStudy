package fileExample;

import java.io.File;
import java.io.IOException;

public class FileTest1 {

	public static void main(String[] args) {
		File f =  new File("d:\\io\\test");
		if(!f.exists()){
			f.mkdir();
		}	
		System.out.println(f.getAbsolutePath());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		File f2 = new File("d:\\io\\test", "测试.txt");
		if(!f2.exists()){
			try {
				f2.createNewFile();
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(f2.getParent());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f2.getName());

	}

}
