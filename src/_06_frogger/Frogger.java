package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int hop;
    int x =300;
    int y= 390;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	background(0,0,255);
    	fill(0, 255, 0);
    	ellipse(x,y, 25, 25);
    	keyPressed();
    	
    }
    public void keyPressed() {
    	if(key == CODED){
    	        if(keyCode == UP)
    	        {
    	            //Frog Y position goes up
    	        	y--;
    	        }
    	        else if(keyCode == DOWN)
    	        {
    	            //Frog Y position goes down 
    	        	y++;
    	        }
    	        else if(keyCode == RIGHT)
    	        {
    	            //Frog X position goes right
    	        	x++;
    	        }
    	        else if(keyCode == LEFT)
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
