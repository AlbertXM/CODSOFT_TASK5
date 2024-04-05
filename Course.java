/** 
 * Class representing a course
 * 
 * @author Manamela Machuene Albert
 * @version codSoft task 5
 */
import java.util.ArrayList;
import java.util.List;

public class Course
{
    private String codeOfCouurse;
    private String Heading;
    private String courseDiscription;
    private int Size;
    private List<String> scList;
    private List<String> studentsRegistered;

    /**
     *  Constructor to initialize the course
     * @param codeOfCouurse
     * @param Heading
     * @param courseDiscription
     * @param capacity
     * @param schedule
     */
    public Course(String codeOfCouurse, String Heading, String courseDiscription, int capacity, List<String> schedule) 
    {
        this.codeOfCouurse = codeOfCouurse;
        this.Heading = Heading;
        this.courseDiscription = courseDiscription;
        this.Size = capacity;
        this.scList = schedule;
        this.studentsRegistered = new ArrayList<>();
    }

    /**
     *  Getters for course details
     * 
     */
    public String getCourseDiscription() 
    {
        return courseDiscription;
    }

    public int getCapacity() 
    {
        return Size;
    }
    
    public String getCodeOfCouurse() 
    {
        return codeOfCouurse;
    }
    
    public String getHeading() 
    {
        return Heading;
    }


    public List<String> getRegisteredStudents() 
    {
        return studentsRegistered;
    }
    
    public List<String> getSchedule() 
    {
        return scList;
    }
    

    /**
     *  Method for registering a student for the course
     * @param studentId
     * @return
     */
    public boolean registerStudent(String sId) 
    {
        if (studentsRegistered.size() < Size) 
        {
            studentsRegistered.add(sId);
            return true;
        }
        return false;
    }

    /**
     *  Method to remove a student from the course
     * @param studentId
     */
    public void removeStudent(String sId) 
    {
        studentsRegistered.remove(sId);
    }
}