import java.lang.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       
        Box[] boxes = new Box[3];

        
        boxes[0] = new Box(10.0, 3.0, 2.0);
        boxes[1] = new Box(8.0, 4.0, 7.0);
        boxes[2] = new Box(12.0, 6.0, 4.0);

       
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("Box " + (i + 1) + " - Length: " + boxes[i].getLength() +
                    ", Width: " + boxes[i].getWidth() + ", Height: " + boxes[i].getHeight());
        }
    }
}
