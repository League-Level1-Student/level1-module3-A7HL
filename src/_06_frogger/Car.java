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
	    Frogger.window.rect(xPos , yPos,  size, 100);
	}
	void moveLeft() {
		xPos-=spd;
		if(xPos<-100) {
			xPos=Frogger.WIDTH+100;
		}
	}
	void moveRight() {
		xPos+=spd;
		if(xPos>Frogger.WIDTH) {
			xPos=-100;
		}
	}
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	public int getSize() {
		return size;
	}
	
}

