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
    //quadrant 1
    for(int intLineX = 0; intLineX <= 200; intLineX += 20){
      fill(0);
      line(intLineX, 0, intLineX, height/2);
    }

    for(int intLineY = 0; intLineY <= 200; intLineY += 20){
      fill(0);
      line(0, intLineY, width/2, intLineY);
    }

    //quadrant 2 (10x10 grid)
    //Row 1
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){ 
      fill(255, 0, 200);
      ellipse(intCircleX, (float)(height/25), (float)(width/20), (float)(height/20));
    }

    //Row 2 (5 rows of 5 circles)
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){
      fill(255, 0, 200);
      ellipse(intCircleX, (float)(height/7.8), (float)(width/20), (float)(height/20));
    }

    //Row 3
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){
      fill(255, 0, 200);
      ellipse(intCircleX, (float)(height/4.5), (float)(width/20), (float)(height/20));
    }

    //Row 4
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){
      fill(255, 0, 200);
      ellipse(intCircleX, (float)(height/3.2), (float)(width/20), (float)(height/20));
    }

    //Row 5
    for(int intCircleX = 220; intCircleX <= 380; intCircleX += 40){
      fill(255, 0, 200);
      ellipse(intCircleX, (float)(height/2.48), (float)(width/20), (float)(height/20));
    }

    //Quadrant 3 (gradient)

    for(int intColour = 0; intColour <= 200; intColour ++){
      stroke(intColour);
      line(intColour, height/2, intColour, height);
    }

    /*int intLines = 0;
    int intColour = 0;

    while(intLines <= 200){
      intLines = intLines + 1;
      intColour = intColour + 1;
    
      stroke(intColour);
      line(intLines, height/2, intLines, height);
    }*/
 
  }
  // define other methods down here.
}