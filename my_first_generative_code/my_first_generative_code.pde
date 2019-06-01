void setup(){
  size(500, 500);
  background(#57F7B3);
}

void draw(){
  stroke(255, mouseY, 0);
  fill(mouseX, 248, 10);
  rect(mouseX, mouseY, 88, 88);
}
