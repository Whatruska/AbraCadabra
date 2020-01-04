package Ticket_2;

public class Circle {
    private int radius;
    private int x;
    private int y;

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getSquare(){
        return Math.PI * radius * radius;
    }

    public double getLength(){
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Radius : " + radius + " \n"
                + "X : " + x + " \n"
                + "Y : " + y + " \n";
    }

    @Override
    public boolean equals(Object obj) {
        Circle o = (Circle) obj;
        return (o.getX() == x && o.getY() == y && o.getRadius() == radius);
    }

    public boolean isIntersects(Circle circle){
        int a = radius;
        int b = circle.getRadius();
        int c = a + b;

        return  ((a + b >= c) && (a + c >= b) && (b + c >= a));
    }
}
