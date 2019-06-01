void setup() {
	size(800, 600);
	background(88, 24, 96);
}

void draw() {
	stroke(0, 88, 24);
	fill(24, 24, 88);
	rect(mouseX, mouseY, 88, 96);
	line(mouseX, mouseY, 400, 300);
}
