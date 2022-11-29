package Classes;

public class Robot {
    private int x;
    private int y;
    private int course;

    public Robot() {x = y = course = 0;}
    public Robot(int x, int y, int course) {this.x = x; this.y = y; this.course = course;}

    public int getX() {return x;}
    public int getY() {return y;}
    public int getCourse() {return course;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setCourse(int course) {this.course = course;}

    public void doSomething() {System.out.println("Hello world");}
}
