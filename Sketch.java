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
    background(135, 206, 235);

    // Show Current Time
    int hr = hour();
    int min = minute();
    int hr12;
    int hrx;
    
    // Make time in 12-hr format and make sure it still aligns when single digit or double digit
    if(hr > 12){
      hr12 = hr - 12;
      hrx = 20;
      fill(0);
      textSize(20);
      text("pm", 70, 30);
    }
    else if(hr < 10){
      hr12 = hr;
      hrx = 20;
      fill(0);
      textSize(20);
      text("am", 70, 30);

    }
    else{
      hr12 = hr;
      hrx = 10;
      fill(0);
      textSize(20);
      text("am", 70, 30);
    }    

    fill(0);
    textSize(20);
    text(hr12, hrx, 30);
    text(":", 35, 30);
    text(min, 40, 30);

    float randomX = random(30, 400);
    float randomY = random(30, 400);
    
    // If statements
    float fltrectcolour1, fltrectcolour2, fltrectcolour3;
    if (randomX > 200 && randomY > 200){
      fltrectcolour1 = 196;
      fltrectcolour2 = 164;
      fltrectcolour3 = 132;
    }
    else if (randomX < 200 && randomY < 200){
      fltrectcolour1 = 255;
      fltrectcolour2 = 192;
      fltrectcolour3 = 203;
    }
    else {
      fltrectcolour1 = 31;
      fltrectcolour2 = 81;
      fltrectcolour3 = 255;
    } 
    
    // Main part of the house
    fill(fltrectcolour1, fltrectcolour2, fltrectcolour3);
    rect(randomX * 0.25f, randomY * 0.5f, randomX * 0.5f, randomY * 0.5f);


    // Roof of the house
    fill(90, 90, 90);
    triangle(randomX * 0.25f, randomY * 0.5f, randomX * 0.75f, randomY * 0.5f, randomX * 0.5f, randomY * 0.375f);

  }

}