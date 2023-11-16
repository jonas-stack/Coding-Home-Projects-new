package DAL;

import BE.Movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class bufferedReaderExample implements IMovieDataAccess {

    @Override
    public List<Movie> getAllMovies() throws Exception {
        List<Movie> movies = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("DATA/ratings.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Assuming that your Movie class has a constructor that parses the line and creates a Movie object
                Movie movie = parseRatingsTxtFromLine(line);
                if (movie != null) {
                    movies.add(movie);
                }
            }
        } catch (IOException e) {
            // Handle the exception appropriately, e.g., log it or throw a custom exception
            e.printStackTrace();
        }
        return movies;
    }

    @Override
    public Movie createMovie(String title, int year) throws Exception {
        // Implementation for creating a movie
        return null;
    }

    @Override
    public void updateMovie(Movie movie) throws Exception {
        // Implementation for updating a movie
    }

    @Override
    public void deleteMovie(Movie movie) throws Exception {
        // Implementation for deleting a movie
    }


    // Assume this method is in the Movie class or create a utility class for parsing
    private Movie parseRatingsTxtFromLine(String line) {
        try {
            // Split the line into parts using a comma as the delimiter
            String[] parts = line.split(","); // Assuming a CSV format, adjust as needed

            // Check if the line has the expected number of parts
            if (parts.length == 3) {
                // Extract individual parts and trim any leading/trailing whitespaces
                int id = Integer.parseInt(parts[0].trim());
                int year = Integer.parseInt(parts[1].trim());
                String title = parts[2].trim();

                // Create a new Movie object using the extracted data
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

