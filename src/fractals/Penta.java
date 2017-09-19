package fractals;

public class Penta extends Flake{
	public void draw(Turtle turtle,int n,double size) {
		this.turtle = turtle;
		turtle.turnTo(180);
		for (int i = 0; i < 5; i++){
			turtle.turn(72.0);
			drawSide(n,size);
		}
	}	
	private void drawSide(int n,double size) {
		if ( n <= 0 )
			turtle.walk(size);
		else {
			double l = size/3.0;
			drawSide(n-1,l);
			turtle.turn(108.0);
			drawSide(n-1,l);
			turtle.turn(-72.0);
			drawSide(n-1,l);
			turtle.turn(-72.0);
			drawSide(n-1,l);
			turtle.turn(-72.0);
			drawSide(n-1,l);
			turtle.turn(108.0);
			drawSide(n-1,l);
		}
	}
}