package _06_frogger;



public class Car{
	private int xPos;
	private int yPos;
	private int spd;
	private int size;
	
	public Car(int x,int y,int s,int si) {
		xPos =x;
		yPos = y;
		spd =s;
		size =si;
		
	}
	void display(){
	    Frogger.window.fill(0,255,0);
	    Frogger.window.rect(xPos , yPos,  size, 50);
	}
	
}

