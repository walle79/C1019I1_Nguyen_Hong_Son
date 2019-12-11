package Point__MoveablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){

    }
    public float[] getSpeed(){
        float[] arrXY = {getxSpeed(),getySpeed()};
        return arrXY;
    }
    @Override
    public String toString(){
        return Arrays.toString(getSpeed())
        + super.toString();
    }
    public void move(){
        super.setX(this.getX()+xSpeed);
        super.setY(this.getY()+ySpeed);
    }
}
