package movie;

public class Movie {

	private String movieName;
	private int releaseYear;
	private Actor[] actors;

	public Movie() {
	}

	public Movie(String movieName, int releaseYear, Actor[] actors) {
		super();
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.actors = actors;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Actor[] getActors() {
		return actors;
	}

	public void setActors(Actor[] actors) {
		this.actors = actors;
	}
	
	private void displayActors() {
		for(Actor actor: actors) {
			actor.displayActor();
		}
	}
	
	public void displayMovie() {
		System.out.println("Movie Name: " + getMovieName());
		System.out.println("Movie Release Year: " + getReleaseYear());
		displayActors();
	}

}