package za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.srp.Violation;

/**
 * Created by student on 2015/02/26.
 */
public class Employee {
    String lname;
    String sname;
    int age;
    int hourIn;
    int hourOut;

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
