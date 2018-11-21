import java.awt.Color;
import java.util.Arrays;

class Collage {
  public static void main(String[] args) {
    Image canvas1 = ImageLibRef.canvasProvided(100, 100, new Color(0, 255, 0));
    System.out.println("canvas1: " + canvas1.toString());
    CSE8ALib.explore(canvas1);
  }
}
