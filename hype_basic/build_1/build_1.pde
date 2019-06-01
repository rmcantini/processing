import hype.*;

void setup() {
	size(700,700);
	H.init(this).background(#242424);

// ************************************************************************************ ROW 1

	HRect s1 = new HRect(100); // set proportional width and height of 100
	s1
		
		.rounding(4)
		.anchorAt(H.CENTER)
		.noStroke()
		.fill(#ECECEC) // set fill color
		.loc(width/2, height/2) // set x and y location
	;
	H.add(s1);

	H.drawStage(); // actualy draws to screen, can be placed at void draw
	//noLoop();
}

//void draw() {

//}
