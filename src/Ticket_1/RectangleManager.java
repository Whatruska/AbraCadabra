package Ticket_1;

public class RectangleManager {
    public static boolean isIntersectsAll(Rectangle[] rectangles){
        for (int i = 0; i < rectangles.length - 1; i++){
            for (int j = i + 1; j < rectangles.length; j++){
                Rectangle rect1 = rectangles[i];
                Rectangle rect2 = rectangles[j];
                if (!rect1.isIntersects(rect2)){
                    return false;
                }
            }
        }
        return true;
    }

    public static int countAllPerimeters(Rectangle[] rects){
        int sum = 0;
        for (Rectangle rectangle : rects){
            sum += rectangle.getPerimeter();
        }
        return sum;
    }

    public static int countAllSquares(Rectangle[] rects){
        int sum = 0;
        for (Rectangle rectangle : rects){
            sum += rectangle.getSquare();
        }
        return sum;
    }
}
