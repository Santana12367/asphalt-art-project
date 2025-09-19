import org.code.neighborhood.*;

public class PainterPlus extends Painter{

public void turnRight(){
  turnLeft();
  turnLeft();
  turnLeft();
}
  
public void takeAllPaint(){
    while(isOnBucket()){
      takePaint();
    }
  }
  
public void moveFast(){
while(canMove()){
move();
  }
}
  
public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
      move();
    }    
  }
  
public void paintDonut(String color){
     while(hasPaint()){
      move();
      paint(color);
      turnRight();
      move();
      paint(color);   
}
}
  public void turnAround(){
    turnLeft();
    turnLeft();
  }
  public void moveFour(){
  move();
  move();
  move();
  move();
  }

  public void paintRow(){
        paint("white");
    move();  
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
  }

  public void paintShortRow(){
        paint("white");
    move();  
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
  }

    public void paintShorterRow(){
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
    move(); 
            paint("white");
  }
  public void paintFoot(){
    turnRight();
    paint("yellow");
    move();
    paint("yellow");
    turnLeft();
    move();
    paint("yellow");
    turnAround();
    move();
    move();
    paint("yellow");
    turnAround();
    move();
    turnLeft();
    move();
    turnRight();
  }
}