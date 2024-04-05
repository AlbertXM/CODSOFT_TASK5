/**
 * Class representing the course and student databases
 * 
 * @author Manamela Machuene Albert
 * @version codSoft task 5
 */

import java.util.ArrayList;
import java.util.List;

public class CourseStudentDatabase 
{
    
    private List<Student> sList;
    private List<Course> cList;

    /**
     *  Constructor to initialize the databases
     */
    public CourseStudentDatabase() 
    {
        this.cList = new ArrayList<>();
        this.sList = new ArrayList<>();
    }

    

    /**
     *  Method to add a student to the database
     * @param student
     */
    public void addStudent(Student student) 
    {
        sList.add(student);
    }
    
    /**
     *  Method to add a course to the database
     * @param course
     */
    public void addCourse(Course course) 
    {
        cList.add(course);
    }

    /**
     * 
     *  Method to display available courses with details and available slots
     */
    public void showCourseListing() 
    {
        System.out.println("Available Courses:");
        for (Course course : cList)
        {
            int availableSlots = course.getCapacity() - course.getRegisteredStudents().size();
            System.out.println(course.getCodeOfCouurse() + " - " + course.getHeading() + " (" + availableSlots + " slots available)");
            System.out.println("courseDiscription: " + course.getCourseDiscription());
            System.out.println("Schedule: " + course.getSchedule());
            System.out.println();
        }
    }

    /**
     *  Method to register a student for a course
     * @param studentId
     * @param codeOfCouurse
     * @return
     */
    public boolean registerCourse(String studentId, String codeOfCouurse) 
    {
        Student myStudent = findStudent(studentId);
        Course course = findCourse(codeOfCouurse);

        if (myStudent != null && course != null && course.registerStudent(studentId)) 
        {
            myStudent.registerCourse(codeOfCouurse);
            return true;
        }
        return false;
    }

    /**
     *  Method to remove a course registration for a student
     * @param studentId
     * @param codeOfCouurse
     */
    public void removeCourse(String studentId, String codeOfCouurse) 
    {
        Student student = findStudent(studentId);
        Course course = findCourse(codeOfCouurse);

        if (student != null && course != null) 
        {
            course.removeStudent(studentId);
            student.dropCourse(codeOfCouurse);
        }
    }

    /**
     *  Helper method for finding a course by code
     * @param codeOfCouurse
     * @return
     */
    private Course findCourse(String codeOfCouurse)
    {
        for (Course course : cList) 
        {
            if (course.getCodeOfCouurse().equals(codeOfCouurse))
            {
                return course;
            }
        }
        return null;
    }
    
    
    /**
     *  Helper method for finding  a student by ID
     * @param studentId
     * @return
     */
    private Student findStudent(String studentId) 
    {
        for (Student student : sList)
        {
            if (student.getStudentId().equals(studentId))
            {
                return student;
            }
        }
        return null;
    }
}
