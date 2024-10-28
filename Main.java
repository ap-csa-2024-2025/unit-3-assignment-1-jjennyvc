import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(4, 8);
    Rectangle r2 = new Rectangle(8, 2);

    boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth() == r2.getLength());

    boolean isCongruent = r1.equals(r2) || isRotated;

    double ratio1 = (double) r1.length / r1.width;
    double ratio2 = (double) r2.length / r2.width;
    boolean isSimilar = isCongruent || (ratio1 == ratio2);

    System.out.println("isRotated: " + isRotated);
    System.out.println("isCongruent: " + isCongruent);
    System.out.println("isSimilar: " + isSimilar);

    
  }
}
