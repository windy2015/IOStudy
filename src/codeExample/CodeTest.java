package codeExample;

public class CodeTest {

	public static void main(String[] args) {
		String string = "测试ab";
		byte[] bytes1 = string.getBytes();
		for(byte by :bytes1){
			System.out.print(Integer.toHexString(by&0xff)+" ");
		}

	}

}
