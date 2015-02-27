package za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction.violation;

/**
 * Created by student on 2015/02/26.
 */
public class Calculator {
    int ans = 0;

    public int answer(Sum[] calc){
        for(Sum num : calc){
            ans+=num.getNum1() + num.getNum2();
        }
        return ans;
    }
}
