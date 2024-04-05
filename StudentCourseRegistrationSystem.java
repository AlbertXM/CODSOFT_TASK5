/**
 * class for executing STUDENT COURSE REGISTRATION SYSTEM
 * 
 * @author Manamela Machuene Albert
 * @version codSoft task 5
 */

import java.util.List;


public class StudentCourseRegistrationSystem 
{
	/**
	 * main methodprovides all functionalities of the student course registration system is controlled here
	 */
    public static void main(String[] args) 
    {
        // Creating a course-student database
        CourseStudentDatabase myDatabase = new CourseStudentDatabase();

        // Adding some courses to the database
        Course c1 = new Course("CSC101", "Introduction to Informatics", "Basic concepts of Informatics", 30, List.of("Monday 10:00-11:00", "Wednesday 10:00-11:00"));
        Course c2 = new Course("MAT201", "Calculus I", "Introduction to calculus", 25, List.of("Tuesday 14:00-16:00", "Thursday 14:00-16:00"));
        myDatabase.addCourse(c1);
        myDatabase.addCourse(c2);

        // Adding some students to the database
        Student s1 = new Student("1001", "Alice");
        Student s2 = new Student("1002", "Bob");
        myDatabase.addStudent(s1);
        myDatabase.addStudent(s2);

        // show available courses
        myDatabase.showCourseListing();

        // Register students for courses
        System.out.println("Registering Alice for CSE101: " + myDatabase.registerCourse("1001", "CSE101"));
        System.out.println("Registering Bob for MTH201: " + myDatabase.registerCourse("1002", "MTH201"));

        // show available courses after registration
        myDatabase.showCourseListing();

        // Remove the course registration
        System.out.println("Removing Alice's registration for CSE101");
        myDatabase.removeCourse("1001", "CSE101");

        // show the available courses after removal
        myDatabase.showCourseListing();
    }
}
