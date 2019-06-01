import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Random_test extends PApplet {

public void setup(){
  
  background(132);
}

public void draw(){
  stroke(random(0, 255));
  strokeWeight(8);
  fill(mouseX, mouseY, 242);
  ellipse(random(0, 800), random(0, 600), 64, 64);
  
  if(mousePressed){
    background(132);
  }
}
  public void settings() {  size(800, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Random_test" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
