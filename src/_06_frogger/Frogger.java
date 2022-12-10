package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 844;
    static final int HEIGHT = 600;
    static Frogger window;
    int hop;
    int x =300;
    int y= 530;
  
    Car c1;
    Car c2;
    Car c3;
    Car c4;
    Car c5;
    PImage back;
    PImage carLeft;
    PImage carRight;
    PImage frog;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
    }

    @Override
    public void setup() {
    	back = loadImage("_06_frogger/froggerBackground.png");
        carLeft = loadImage("_06_frogger/carLeft.png");
        carLeft.resize(160,100);
        carRight = loadImage("_06_frogger/carRight.png");
        carRight.resize(160,100);
        frog = loadImage("_06_frogger/frog.png");
        frog.resize(75,75);
        
        //PImage image, int x,int y,int s,int si
    	c1 = new Car(carRight,0,135,10,160);
    	c2 = new Car(carLeft,0,215,10,160);
    	c3 = new Car(carRight,0,295,10,160);
    	c4 = new Car(carLeft,0,365,10,160);
    	c5 = new Car(carRight,0,445,10,160);
    	window=this;
    }

    @Override
    public void draw() {
    	
    	background(back);
        image (frog, x, y);
        
    	//background(0,0,255);
    	c1.moveRight();
    	c2.moveLeft();
    	c3.moveRight();
    	c4.moveLeft();
    	c5.moveRight();
    	c1.display();
    	c2.display();
    	c3.display();
    	c4.display();
    	c5.display();
    	
    	
    	keyPressed();
    	if(intersects(c1)||intersects(c2)||intersects(c3)||intersects(c4)||intersects(c5)) {
    		x=300;
    		y=530;
    	}
    
    }
    public void keyPressed() {
    	if(key == CODED){
    	        if(keyCode == UP&&y>=0)
    	        {
    	            //Frog Y position goes up
    	        	y-=3;
    	        }
    	        else if(keyCode == DOWN&&y<=HEIGHT)
    	        {
    	            //Frog Y position goes down 
    	        	y+=3;
    	        }
    	        else if(keyCode == RIGHT&&x<=WIDTH)
    	        {
    	            //Frog X position goes right
    	        	x+=3;
    	        }
    	        else if(keyCode == LEFT&&x>=0)
    	        {
    	            //Frog X position goes left
    	        	x-=3;
    	        }
    	    }    
    }
   
    boolean intersects(Car car) {
    	if((y>car.getY()&&y<car.getY()+50)&&x>car.getX()&&x<car.getX()+car.getSize()) {
    		return true;
    	}else {
    	return false;
    	}
    }

    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
