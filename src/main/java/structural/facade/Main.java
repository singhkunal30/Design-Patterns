package structural.facade;

public class Main {
	public static void main(String[] args) {
		// Create subsystem objects
		DVDPlayer dvdPlayer = new DVDPlayer();
		Projector projector = new Projector();
		SoundSystem soundSystem = new SoundSystem();
		Lights lights = new Lights();

		// Create a facade to simplify interactions
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, lights);

		// Use the facade to watch a movie
		homeTheater.watchMovie("Inception");

		// End the movie
		homeTheater.endMovie();
	}
}
