package Odev3;

public class InstructorManager  extends UserManager {
	
public void addCourse() {
	
System.out.println("kurs eklendi");
}


public void removeCourse() {
	
	System.out.println("kurs silindi");
}

public void showStudent�nfo(Student student) {
	
	
	System.out.println("��renci isim:"+student.getName()+"\n��renci id:"+student.getId());
	
	
	for(String courses:student.coursesAttended) {
		
		System.out.println(" \nkat�ld��� kurslar :"+courses);
	}
}


public void deleteStudent(Student student) {
	System.out.println(student+" kurstan silinmi�tir");
}

}
