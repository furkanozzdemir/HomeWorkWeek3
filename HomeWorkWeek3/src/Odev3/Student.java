package Odev3;
public class Student extends User{
	
	String addres; 
	String [] coursesAttended=new String[5];
	
	
	public Student(int id, String name, String contactNumber, String addres, String email) {
		super(id, name, contactNumber,  email);
		this.addres=addres;
	
	}

}
