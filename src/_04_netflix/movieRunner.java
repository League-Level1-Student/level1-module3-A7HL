package _04_netflix;

public class movieRunner {
	public static void main(String[] args) {
		Movie one = new Movie("Your Name",5);
		Movie two = new Movie("Spirited Away",5);
		Movie three = new Movie("Demon Slayer: Mugen Train",4);
		Movie four = new Movie("Kizumonogatri I",4);
		Movie five = new Movie("A Silent Voice",5);
		
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(one);
		queue.addMovie(two);
		queue.addMovie(three);
		queue.addMovie(four);
		queue.addMovie(five);
		
		queue.printMovies();
		queue.getBestMovie();
		
	}
}
