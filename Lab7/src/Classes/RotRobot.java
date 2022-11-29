package Classes;
import Interfaces.Rotatable;

public class RotRobot extends Robot implements Rotatable {
    private int start_ang;
    private int end_ang;

    public RotRobot() {
        super();
        start_ang = 0;end_ang = 0;
    }
    public RotRobot(int x, int y, int course, int start_ang, int end_ang) {
        super(x, y, course);
        this.start_ang = start_ang;this.end_ang = end_ang;
    }
    public int getStart_ang() {return start_ang;}
    public void setStart_ang(int start_ang) {this.start_ang = start_ang;}
    public int getEnd_ang() {return end_ang;}
    public void setEnd_ang(int end_ang) {this.end_ang = end_ang;}

    @Override
    public void move() {
        while(start_ang != end_ang) {
            if(start_ang < end_ang) {
                rotateForward();
                doSomething();
            }
            else {
                rotateBackward();
                doSomething();
            }
        }
    }
    @Override
    public void rotateForward() {
        setCourse(start_ang += step_angle);
    }
    @Override
    public void rotateBackward() {
        setCourse(start_ang -= step_angle);
    }
    public void doSomething(){System.out.println("RotRobot: I am working!");}
}
