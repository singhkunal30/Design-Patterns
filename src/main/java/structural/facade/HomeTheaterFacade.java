package structural.facade;

public class HomeTheaterFacade {
	private DVDPlayer dvdPlayer;
	private Projector projector;
	private SoundSystem soundSystem;
	private Lights lights;

	public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.soundSystem = soundSystem;
		this.lights = lights;
	}

	public void watchMovie(String movie) {
		System.out.println("Getting ready to watch a movie...");
		lights.dim(10);
		projector.on();
		projector.setInput("DVD Player");
		soundSystem.on();
		soundSystem.setVolume(10);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}

	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		dvdPlayer.off();
		soundSystem.off();
		projector.off();
		lights.dim(100); // Lights back to full brightness
	}
}
