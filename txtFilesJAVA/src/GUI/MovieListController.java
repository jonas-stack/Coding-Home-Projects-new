package GUI;

import BE.Movie;
import BE.Users;
import DAL.bufferedReaderExample;
import DAL.nioFileExample;
import DAL.scannerExample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;


public class MovieListController {

    @FXML
    public ListView<Movie> itemList; // outcomment to switch between list, reason for this is that they are displayed in the same listView
    //public ListView<Users> itemList; // outcomment to switch between list, reason for this is that they are displayed in the same listView

    public void initialize() {

        /*
        try {
            scannerExample dataAccess = new scannerExample();
            ObservableList<Users> users = FXCollections.observableArrayList(dataAccess.getAllUsers());
            itemList.setItems(users);

            // Print the list of users to the console
            for (Users user : users) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

         */



        // Initialize the list view with data from the data access class with "nioFileExample"
        try {
            nioFileExample dataAccess = new nioFileExample(); // Fix the class name
            ObservableList<Movie> movies = FXCollections.observableArrayList(dataAccess.getAllMovies());
            itemList.setItems(movies);
        } catch (Exception e) {
            e.printStackTrace();
        }




        /*
        // Initialize the list view with data from the data access class with "bufferedReaderExample"
        try {
            bufferedReaderExample dataAccess = new bufferedReaderExample();
            ObservableList<Movie> movies = FXCollections.observableArrayList(dataAccess.getAllMovies());
            itemList.setItems(movies);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }
}
