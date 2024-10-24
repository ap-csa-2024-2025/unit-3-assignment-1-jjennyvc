import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(4, 8);
    Rectangle r2 = new Rectangle(8, 2);

    boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth() == r2.getLength());

    
  }
}
