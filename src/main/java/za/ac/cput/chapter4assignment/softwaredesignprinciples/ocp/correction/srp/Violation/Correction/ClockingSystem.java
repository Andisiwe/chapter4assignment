package za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.srp.Violation.Correction;

/**
 * Created by student on 2015/02/26.
 */
public class ClockingSystem {
    int hourIn;
    int hourOut;

    public int getHourIn() {
        return hourIn;
    }

    public void setHourIn(int hourIn) {
        this.hourIn = hourIn;
    }

    public int getHourOut() {
        return hourOut;
    }

    public void setHourOut(int hourOut) {
        this.hourOut = hourOut;
    }

    public int calcHoursWorked(){
        return hourOut - hourIn;
    }
}
