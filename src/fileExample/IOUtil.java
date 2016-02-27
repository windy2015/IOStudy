package fileExample;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOUtil {
	/**
	 * 根据文件名读出文件，以16进制形式展现
	 * @param fileName
	 */
	public static void writeHex(String fileName) throws IOException{
		FileInputStream fis = new FileInputStream(fileName);
		int b ;
		while((b=fis.read())!=-1){
			System.out.print(Integer.toHexString(b)+" ");
		}
		fis.close();		
	}
	
	/**
	 * 批量读取InputStream
	 * @param filename
	 * @throws IOException
	 */
	public static void batchReadHex(String filename) throws IOException{
		FileInputStream in  = new FileInputStream(filename);
		byte[] bt = new byte[2*1024];
		int length;
		while ((length=in.read(bt,0,bt.length))!=-1){
			for(int i=0;i<length;i++){
				System.out.print(bt[i]+" ");
			}
		}
		in.close();
		
	}
	
	/**
	 * 批量复制文件内容
	 * @param desFile
	 * @param targetFile
	 */
	public static void copy(File desFile ,File targetFile)throws IOException{
		if(!desFile.exists()){
			throw new IllegalArgumentException("文件不存在");
		}
		if(!desFile.isFile()){
			throw new IllegalArgumentException(desFile+"不是文件");
		}
		FileInputStream in  = new FileInputStream(desFile);
	    FileOutputStream out = new FileOutputStream(targetFile);
	    byte[] bytes = new byte[8*1024];
	    int b= 0;
	    while((b=in.read(bytes, 0, bytes.length))!=-1){
	    	out.write(bytes, 0, b);
	    }
	    in.close();
	    out.close();
	}
	
	/**
	 * 复制文件内容根据字节
	 * @param desFile
	 * @param targetFile
	 * @throws IOException
	 */
	public static void copyByByte(File desFile,File targetFile) throws IOException{
		if(!desFile.exists()){
			throw new IllegalArgumentException("文件不存在");
		}
		if(!desFile.isFile()){
			throw new IllegalArgumentException(desFile+"不是文件");
		}
		FileInputStream in  = new FileInputStream(desFile);
	    FileOutputStream out = new FileOutputStream(targetFile);
	    int b;
	    while((b=in.read())!=1){
	    	out.write(b);
	    }
	    in.close();
	    out.close();
	}
	
	/**
	 * 缓冲流实现复制文件内容
	 * @param desFile
	 * @param targetFile
	 * @throws IOException
	 */
	public static void copyByBuffer(File desFile, File targetFile) throws IOException{
		if(!desFile.exists()){
			throw new IllegalArgumentException("文件不存在");
		}
		if(!desFile.isFile()){
			throw new IllegalArgumentException(desFile+"不是文件");
		}
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(desFile));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(targetFile));
		int b;
		while((b=in.read())!=-1){
			out.write(b);
			out.flush();
		}
		in.close();
		out.close();
	}
	
}
