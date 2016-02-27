package fileExample;

import java.io.File;

/**
 * File常用工具类，如过滤和遍历
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>succez</p>
 * @author John
 * @createdate 2016年1月24日
 */
public class FileUtils {
	/**
	 * 列出目录下的所有文件
	 * @param file
	 */
	public static void listDirectory(File dir){
		if(!dir.exists()){
			throw new IllegalArgumentException("目录"+dir+"不存在");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是目录");
		}
		File[] files =  dir.listFiles();
		if(files!=null&&files.length>0){
			for(File file:files){
				if(file.isDirectory()){
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
		
		
		
	}

}
