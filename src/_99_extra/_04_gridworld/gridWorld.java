package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridWorld {

	public static void main(String[] args) {
		World word = new World();
		word.show();
		Bug red1 = new Bug();
		Location loc =new Location(1,2);
		word.add(loc, red1);
		Bug blue = new Bug(Color.BLUE);
		Location loc2 =new Location(8,4);
		word.add(loc2, blue);
		Flower flow = new Flower();
		Location loc3 = new Location(9,4);
		word.add(loc3, flow);
		
		
	}
}
