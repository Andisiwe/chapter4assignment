package za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction;

/**
 * Created by student on 2015/02/26.
 */
public class Diffrerence extends Calculator {
    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    @Override
    public int answer() {
        return firstNumber - secondNumber;
    }
}
