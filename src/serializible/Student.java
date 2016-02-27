package serializible;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private  transient int age;
	
	public Student(){
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	 private void writeObject(java.io.ObjectOutputStream s)
		        throws java.io.IOException{		        
		        s.defaultWriteObject();
		        s.writeInt(age);
		    }
	 
	 private void readObject(java.io.ObjectInputStream s)
		        throws java.io.IOException, ClassNotFoundException {
		        
		        // Read in size, and any hidden stuff
		        s.defaultReadObject();

		        // Read in capacity
		        this.age = s.readInt(); // ignored

		        
		    }
	
	


}
