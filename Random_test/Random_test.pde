void setup(){
  size(800, 600);
  background(132);
}

void draw(){
  stroke(random(0, 255));
  strokeWeight(8);
  fill(mouseX, mouseY, 242);
  ellipse(random(0, 800), random(0, 600), 64, 64);
  
  if(mousePressed){
    background(132);
  }
}
