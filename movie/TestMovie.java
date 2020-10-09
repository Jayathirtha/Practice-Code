package movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestMovie {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the movies count: ");
		Movie[] movies = new Movie[scanner.nextInt()];

		for (int i = 0; i < movies.length; i++) {
			System.out.print("Enter the Movie Name: ");
			String movieName = bufferedReader.readLine();

			System.out.print("Enter Release Year: ");
			int releaseYear = scanner.nextInt();

			System.out.print("Enter the Actors count: ");
			Actor[] actors = new Actor[scanner.nextInt()];

			for (int j = 0; j < actors.length; j++) {

				System.out.print("Enter Actor Name: ");
				String actorName = bufferedReader.readLine();

				System.out.print("Enter Actor Name in Movie: ");
				String actorRoleName = bufferedReader.readLine();

				Actor actor = new Actor(actorName, actorRoleName);

				actors[j] = actor;

			}

			Movie movie = new Movie();
			movie.setMovieName(movieName);
			movie.setReleaseYear(releaseYear);
			movie.setActors(actors);
			
			movies[i] = movie;

		}

		System.out.println();
		System.out.println("Provided inputs were as follows");

		for (Movie movie : movies) {
			movie.displayMovie();
		}

		scanner.close();
	}
}