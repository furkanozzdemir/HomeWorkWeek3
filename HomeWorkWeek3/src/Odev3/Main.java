package Odev3;

public class Main {

	public static void main(String[] args) {
	  Student student1=new Student(1,"furkan �zdemir","568749","tdnt1@gmail.com","adana");
StudentManager studentmenager=new StudentManager();
studentmenager.addCard�nformation(student1);
studentmenager.editProfile(student1);
studentmenager.changeCard�nformation(student1);
studentmenager.showMyCourses(student1);

System.out.println("********************************************************************");



Instructor �nstructor=new Instructor(1, "engin demiro�", "031448", "engindemirog@gmail.com");

InstructorManager   instructormanager=new InstructorManager();

instructormanager.addCourse();
instructormanager.showStudent�nfo(student1);
instructormanager.deleteStudent(student1);
instructormanager.removeCourse();
System.out.println("**********************************************************************");


UserManager usermnager=new UserManager();
usermnager.editProfile(�nstructor);
usermnager.editProfile(student1);
usermnager.logOut(�nstructor);
usermnager.logOut(student1);


	}

}