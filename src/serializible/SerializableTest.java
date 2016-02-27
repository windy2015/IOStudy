package serializible;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试序列化
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>succez</p>
 * @author John
 * @createdate 2016年2月3日
 */

public class SerializableTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String path = "d:\\io\\student.dat";		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        Student stu  = new Student();
        stu.setName("liuxc");
        stu.setAge(21);
        oos.writeObject(stu);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Student s = (Student)ois.readObject();
        System.out.println(s);
        ois.close();
        
        
        oos.close();
	}

	
}
