package Odev3;

public class Main {

	public static void main(String[] args) {
	  Student student1=new Student(1,"furkan özdemir","568749","tdnt1@gmail.com","adana");
StudentManager studentmenager=new StudentManager();
studentmenager.addCardİnformation(student1);
studentmenager.editProfile(student1);
studentmenager.changeCardİnformation(student1);
studentmenager.showMyCourses(student1);

System.out.println("********************************************************************");



Instructor ınstructor=new Instructor(1, "engin demiroğ", "031448", "engindemirog@gmail.com");

InstructorManager   instructormanager=new InstructorManager();

instructormanager.addCourse();
instructormanager.showStudentİnfo(student1);
instructormanager.deleteStudent(student1);
instructormanager.removeCourse();
System.out.println("**********************************************************************");


UserManager usermnager=new UserManager();
usermnager.editProfile(ınstructor);
usermnager.editProfile(student1);
usermnager.logOut(ınstructor);
usermnager.logOut(student1);


	}

}