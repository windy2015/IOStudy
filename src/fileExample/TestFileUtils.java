package fileExample;

import java.io.File;

public class TestFileUtils {

	public static void main(String[] args) {
		String dirStr ="d:\\io";
		File dir = new File(dirStr);
		FileUtils.listDirectory(dir);
	}

}
