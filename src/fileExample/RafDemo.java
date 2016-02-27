package fileExample;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RafDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("demo");
		if(!file.exists()){
			file.mkdirs();
		}
		File demo  = new File(file, "rf.dat");
		if(!demo.exists()){
			demo.createNewFile();
		}
		RandomAccessFile rf = new RandomAccessFile(demo, "rw");
		
		System.out.println(rf.getFilePointer());
		
		rf.writeBytes("A");
		System.out.println(rf.getFilePointer());
		String s ="中";
		rf.write(s.getBytes());
		System.out.println(rf.getFilePointer());
		
		byte[] b = new byte[(int)rf.length()];
		rf.seek(0);
		rf.read(b);
		for(byte b1:b){
			System.out.print(b1+" ");
		}
		rf.close();
	
		

	}

}
