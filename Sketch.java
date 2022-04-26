/**
* A drawing of four quadrants, using loops to create four different patterns.
* @author: J.Woo
*
*/
import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
  * Called once at the beginning of execution, put your size all in this method
  */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    stroke(0);
    
    //Quadrant 1 (10x10 grid)
    
    //Column lines
    for(int intLineX = 0; intLineX <= 200; intLineX += 20){
      fill(0);
      line(intLineX, 0, intLineX, height/2);
    }

    //Row lines
    for(int intLineY = 0; intLineY <= 200; intLineY += 20){
      fill(0);
      line(0, intLineY, width/2, intLineY);
    }

    //Quadrant 2 (5x5 row of circles)

    //Row 1
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){ 
      fill(255, 0, 179);
      ellipse(intCircleX, (float)(height/19.8), (float)(width/20), (float)(height/20));
    }

    //Row 2
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){
      fill(255, 0, 179);
      ellipse(intCircleX, (float)(height/6.5), (float)(width/20), (float)(height/20));
    }

    //Row 3
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){
      fill(255, 0, 179);
      ellipse(intCircleX, (float)(height/3.96), (float)(width/20), (float)(height/20));
    }

    //Row 4
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){
      fill(255, 0, 179);
      ellipse(intCircleX, (float)(height/2.82), (float)(width/20), (float)(height/20));
    }

    //Row 5
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){
      fill(255, 0, 179);
      ellipse(intCircleX, (float)(height/2.22), (float)(width/20), (float)(height/20));
    }
        
    //Quadrant 3 (grayscale gradient)

    for(int intColour = 0; intColour <= 200; intColour ++){
      stroke(intColour);
      line(intColour, height/2, intColour, height);
    }

    //Quadrant 4 (8-petal flower)

    // Change outline to black
    stroke(12,12,12);
    
    // Set petal colour to orange
    fill(240,128,0);

    // Translate the point to the center of the fourth quadrant
    translate(width * (float)0.75, height * (float) 0.75);
    
    // Loop for petals
    for(int intPetal = 0; intPetal < 8; intPetal++){

    // Rotate petals
    rotate(PI/4);

    // Create petals
    ellipse(0,0, width / 17 , height / (float)2.8);
    }
    noStroke();

    // Set the colour of the centre of the flower + creating it
    fill(45,180,78);
    ellipse(0,0,width/10,height/10);

  }
  
}