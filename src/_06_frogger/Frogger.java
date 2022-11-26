package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    static Frogger window;
    int hop;
    int x =300;
    int y= 390;
    Car c1;
    Car c2;
    Car c3;
    Car c4;
    Car c5;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	c1 = new Car(0,0,100,100);
    	c2 = new Car(0,120,10,100);
    	c3 = new Car(0,240,10,100);
    	c4 = new Car(0,360,10,100);
    	c5 = new Car(0,480,10,100);
    	window=this;
    }

    @Override
    public void draw() {
    	background(0,0,255);
    	c1.display();
    	c2.display();
    	c3.display();
    	c4.display();
    	c5.display();
    	fill(0, 255, 0);
    	ellipse(x,y, 25, 25);
    	keyPressed();
    	
    }
    public void keyPressed() {
    	if(key == CODED){
    	        if(keyCode == UP&&y>=0)
    	        {
    	            //Frog Y position goes up
    	        	y--;
    	        }
    	        else if(keyCode == DOWN&&y<=HEIGHT)
    	        {
    	            //Frog Y position goes down 
    	        	y++;
    	        }
    	        else if(keyCode == RIGHT&&x<=WIDTH)
    	        {
    	            //Frog X position goes right
    	        	x++;
    	        }
    	        else if(keyCode == LEFT&&x>=0)
    	        {
    	            //Frog X position goes left
    	        	x--;
    	        }
    	    }    
    }
  

    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
