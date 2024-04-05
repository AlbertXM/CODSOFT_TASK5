/**
 * Class representing a student
 * 
 * @author Manamela Machuene Albert
 * @version codSoft task 5
 */
 
import java.util.ArrayList;
import java.util.List;

public class Student 
{
    
    private List<String> coursesRegistered;
    private String myStudentId;
    private String names;

    /**
     *  Constructor to initialize the student
     * @param myStudentId
     * @param name
     */
    public Student(String myStudentId, String name) 
    {
        this.myStudentId = myStudentId;
        this.names = name;
        this.coursesRegistered = new ArrayList<>();
    }

    /*
     *  Getters for student details
     */
    public String getStudentId() 
    {
        return myStudentId;
    }

    public String getName() 
    {
        return names;
    }

    public List<String> getRegisteredCourses() 
    {
        return coursesRegistered;
    }

    

    /**
     *  Method to drop a course
     * @param courseCode
     */
    public void dropCourse(String courseCode) 
    {
        coursesRegistered.remove(courseCode);
    }
    
    /**
     *  Method to register for a course
     * @param courseCode
     */
    public void registerCourse(String courseCode) 
    {
        coursesRegistered.add(courseCode);
    }
}

