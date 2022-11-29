package Classes;

import Interfaces.Shiftable;

public class ShiftRobot extends Robot implements Shiftable {
    private int start_shift;
    private int end_shift;

    public ShiftRobot() {
        super();
        start_shift = 0;end_shift = 0;
    }
    public ShiftRobot(int x, int y, int course, int start_shift, int end_shift) {
        super(x, y, course);
        this.start_shift = start_shift;this.end_shift = end_shift;
    }
    public int getStart_shift() {return start_shift;}
    public void setStart_shift(int start_shift) {this.start_shift = start_shift;}
    public int getEnd_shift() {return end_shift;}
    public void setEnd_shift(int end_shift) {this.end_shift = end_shift;}

    @Override
    public void move() {
        if(getX() == start_shift) {
            if(getCourse() == 90) {
                while(getY() != end_shift) {
                    shiftForward();
                    doSomething();
                }
            }
            else if(getCourse() == 270) {
                while(getY() != end_shift) {
                    shiftBackward();
                    doSomething();
                }
            }
            else {
                System.out.println("It's not working in this way...");
            }
        } else if (getY() == end_shift) {
            if (getCourse() == 0) {
                while (getX() != start_shift) {
                    shiftForward();
                    doSomething();
                }
            }
            else if (getCourse() == 180) {
                while (getX() != start_shift) {
                    shiftBackward();
                    doSomething();
                }
            }
            else {
                System.out.println("It's not working in this way...");
            }
        }
        else{System.out.println("I am here");}
    }
    @Override
    public void shiftForward() {
        if(getX() == start_shift) setY(getY() + step_shift);
        else setX(getX() + step_shift);
    }
    @Override
    public void shiftBackward() {
        if(getX() == start_shift) setY(getY() - step_shift);
        else setX(getX() - step_shift);
    }
    public void doSomething(){System.out.println("ShiftRobot: I am working!");}
}
