package Interfaces;

public interface Rotatable extends Movable{
    public static final int step_angle = 90;
    public void rotateForward();
    public void rotateBackward();
}