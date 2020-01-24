package studentlist;

/**
 * This class represents
 * @author Sanjana Chowdhury
 */
public class PartTimeStudent extends Student {

    private int hoursOfStudy;
    
    public PartTimeStudent(String givenName, String givenID) {
        super(givenName, givenID);
    }

    public int getHoursOfStudy() {
        return hoursOfStudy;
    }

    public void setHoursOfStudy(int hoursOfStudy) {
        this.hoursOfStudy = hoursOfStudy;
    }
}
    
