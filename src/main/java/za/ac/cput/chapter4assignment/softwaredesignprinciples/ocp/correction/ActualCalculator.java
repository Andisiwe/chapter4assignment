package za.ac.cput.chapter4assignment.softwaredesignprinciples.ocp.correction;

/**
 * Created by student on 2015/02/26.
 */
public class ActualCalculator {
    int ans = 0;

    public int answer(Calculator[] calc){
        for(Calculator num : calc){
            ans+=num.answer();
        }
        return ans;
    }
}
