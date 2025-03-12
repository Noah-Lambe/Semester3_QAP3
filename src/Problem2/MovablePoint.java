package Problem2;

public class MovablePoint extends Point {
    private float xspeed;
    private float yspeed;

    public MovablePoint() {
        xspeed = 0.0f;
        yspeed = 0.0f;
    }

    public MovablePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MovablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXSpeed() {
        return xspeed;
    }

    public float getYSpeed() {
        return yspeed;
    }

    public void setXSpeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public void setYSpeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public void setSpeed(float xspeed, float yspeed) {
        setXSpeed(xspeed);
        setYSpeed(yspeed);
    }

    public float[] getSpeed() {
        return new float[] {xspeed, yspeed};
    }

    public String toString() {
        return super.toString() + ", Speed: (" + xspeed + ", " + yspeed + ")";
    }

    public MovablePoint move() {
        setX(getX() + xspeed);  // Equivalent to x += xspeed;
        setY(getY() + yspeed);  // Equivalent to y += yspeed;
        return this;
    }
}
