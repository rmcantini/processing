import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import hype.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class build_1 extends PApplet {



public void setup() {
	
	H.init(this).background(0xff242424);

// ************************************************************************************ ROW 1

	HRect s1 = new HRect(100); // set proportional width and height of 100
	s1
		
		.rounding(4)
		.anchorAt(H.CENTER)
		.noStroke()
		.fill(0xffECECEC) // set fill color
		.loc(width/2, height/2) // set x and y location
	;
	H.add(s1);

	H.drawStage(); // actualy draws to screen, can be placed at void draw
	//noLoop();
}

public void draw() {

}
  public void settings() { 	size(640,640); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build_1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
