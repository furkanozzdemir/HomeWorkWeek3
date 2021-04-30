package Odev3;

public class InstructorManager  extends UserManager {
	
public void addCourse() {
	
System.out.println("kurs eklendi");
}


public void removeCourse() {
	
	System.out.println("kurs silindi");
}

public void showStudentİnfo(Student student) {
	
	
	System.out.println("öğrenci isim:"+student.getName()+"\nöğrenci id:"+student.getId());
	
	
	for(String courses:student.coursesAttended) {
		
		System.out.println(" \nkatıldığı kurslar :"+courses);
	}
}


public void deleteStudent(Student student) {
	System.out.println(student+" kurstan silinmiştir");
}

}
