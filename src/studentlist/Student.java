/**
 * A class to model students. Students can study. They have a name and an ID
 * and now they have a program name.
 */
package studentlist;
// this is a pull operation test
public class Student 
{
    private String name;
    private String studentID; 
    private String program;
    
    /**
     * A constructor that takes in bot parameters.
     * @param givenName - the student's name
     * @param givenID - the student's ID
     */
    public Student(String givenName, String givenID)
    {
        name = givenName;
        studentID = givenID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) { 
        this.name = name;
    }

    /**
     * @return the StudentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param StudentID the StudentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    
    
    /**
     * a method that returns true if a student studies and false otherwise.
     * @return whether or not the student studied.
     */
}
