package DAL;

import BE.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class nioFileExample implements IMovieDataAccess {

    private static final String MOVIES_FILE = "DATA/movie_titles.txt";

    @Override
    public List<Movie> getAllMovies() throws Exception {
        List<Movie> movies = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(MOVIES_FILE));
            for (String line : lines) {
                Movie movie = parseMovieTxtFileFromLine(line);
                if (movie != null) {
                    movies.add(movie);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }

    @Override
    public Movie createMovie(String title, int year) throws Exception {
        return null;
    }

    @Override
    public void updateMovie(Movie movie) throws Exception {

    }

    @Override
    public void deleteMovie(Movie movie) throws Exception {

    }

    // Assume this method is in the Movie class or create a utility class for parsing
    private Movie parseMovieTxtFileFromLine(String line) {
        try {
            String[] parts = line.split(","); // Assuming a CSV format, adjust as needed
            if (parts.length == 3) {
                int id = Integer.parseInt(parts[0].trim());
                int year = Integer.parseInt(parts[1].trim());
                String title = parts[2].trim();

                return new Movie(id, year, title);
            } else {
                // Handle the case where the line format is incorrect
                // You may want to log an error or throw an exception
                return null;
            }
        } catch (NumberFormatException e) {
            // Handle the case where parsing fails (e.g., if id, year, or rating is not a valid integer)
            // You may want to log an error or throw an exception
            return null;
        }
    }
}