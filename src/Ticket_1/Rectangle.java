package Ticket_1;

public class Rectangle {


    /*

    <--- Начало координат

    ------------------------------------(x2,y2)
    |                                   |
    |                                   |
    |                                   |
    |                                   |
    |                                   |
    |                                   |
    |                                   |
    |                                   |
    (x1, y1)----------------------------

     */

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private int width;
    private int heigth;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        width = Math.abs(x2 - x1);
        heigth = Math.abs(y1 - y2);
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getPerimeter(){
        return 2 * (width + heigth);
    }

    public int getSquare(){
        return width * heigth;
    }

    public boolean isIntersects(Rectangle rect){
        int x3 = rect.getX1();
        int y3 = rect.getY1();

        int x4 = rect.getX2();
        int y4 = rect.getY2();

        Rectangle newRect = new Rectangle(x3, y1, x2, y4);
        return newRect.getSquare() > 0;
    }
}
