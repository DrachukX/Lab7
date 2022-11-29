package Classes;

public class Action {
    private ActionType action;
    private int step_count;

    public Action() {step_count = 0;}
    public Action(ActionType action, int step_count) {
        this.action = action;this.step_count = step_count;
    }

    public ActionType getAction() {return action;}
    public void setAction(ActionType action) {this.action = action;}
    public int getStep_count() {return step_count;}
    public void setStep_count(int step_count) {this.step_count = step_count;}

    public static enum ActionType{
        RotF, RotB, ShiftF, ShiftB, DoSmth
    }
}
