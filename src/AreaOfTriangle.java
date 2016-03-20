import com.sun.javafx.geom.PickRay;

/**
 * Created by User on 08.03.2016.
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        try {
            int b = 2;
            int h = -1;
            int r = 2;
            char Radius = 'r';
            char base = 'b';
            char height = 'h';
            char AreaOfTriangle = 'c';
            char AreaOfRectangle = 'v';
            char AreaOfCircle = 'k';
            int c = ((b * h) / 2);
            int v = b * h;
            double a = 2;
            double d = Math.pow(r, a);
            double k = (3.14 * d);
            boolean cNegative = c < 0;
            boolean vNegative = v < 0;
            boolean kNegative = k < 0;
            if (c > 0) {
                System.out.println("Area of Triangle: " + c);
            }
            if (v > 0) {
                System.out.println("Area of Rectangle: " + v);
            }
            if (k > 0) {
                System.out.println("Area of Circle: " + k);
            }

            if (cNegative && vNegative) {
                throw new IllegalArgumentException("Areas of Triangle and Rectangle are negative");
            }
            if (cNegative) {
                throw new IllegalArgumentException("Area of Triangle is negative");
            }
            if (vNegative) {
                throw new IllegalArgumentException("Area of Rectange is negative");
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
