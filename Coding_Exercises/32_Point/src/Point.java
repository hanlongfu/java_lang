public class Point {
    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;;
    }

    //getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    //setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    //(this.x, this.y) (x, y)
    public double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
    }
    public double distance(Point another){
        int anotherX = another.getX();
        int anotherY = another.getY();
        return Math.sqrt((this.x-anotherX)*(this.x-anotherX) + (this.y-anotherY)*(this.y-anotherY));
    }
}
