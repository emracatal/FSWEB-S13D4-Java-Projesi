public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(getX() - 0, 2) + Math.pow(getY() - 0, 2));
    }

    public double distance(Point p) {
        return (p!=null) ? Math.sqrt(Math.pow(getX()-p.getX(), 2) + Math.pow(getY()-p.getY(), 2)) : -1;
    }


    public double distance(int a,int b) {
        return Math.sqrt(Math.pow(getX()-a, 2) + Math.pow(getY()-b, 2));
    }

}
