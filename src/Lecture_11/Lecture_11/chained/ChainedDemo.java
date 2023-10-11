package Lecture_11.Lecture_11.chained;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChainedDemo {

    public static void main(String[] args) {
            getLeave();

    }

    /**
     *
     * @throws NoLeaveGrantedException If Team lean is upset I don't care :)
     */
    private static void getLeave() throws NoLeaveGrantedException {
        try {
            howIsTeamLead();
        } catch (NullPointerException e) {
            throw new NoLeaveGrantedException("I am on leave. 1.", e);
        } catch (NoLeaveGrantedException e) {
            throw new NoLeaveGrantedException("I am on leave, 2.", e);
        } catch (RuntimeException e) {
            throw new NoLeaveGrantedException("I am on leave! 3.", e);
        } catch (TeamLeadUpsetException e){
            throw new NoLeaveGrantedException("I am on leave!.. 4.", e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void howIsTeamLead() throws TeamLeadUpsetException {
        throw new TeamLeadUpsetException("Team lead is Upset.");
    }
}
