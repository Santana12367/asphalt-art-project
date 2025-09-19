import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    BackgroundPainter rizz = new BackgroundPainter();
    rizz.setPaint(1000);
    rizz.paintBackground("PaleGreen");
DuckPainter rizz2 = new DuckPainter();
  rizz2.setPaint(1000);
  rizz2.move();
  rizz2.move();
  rizz2.move();
  rizz2.move();
  rizz2.move();
    rizz2.turnRight();
    rizz2.move();
    rizz2.turnLeft();
  rizz2.paintHead();
  rizz2.paintBody();
  rizz2.paintFeet();



    
  }
}