
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {

        Application.launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/MovieList.fxml")); // Note the leading '/'
        Parent root = loader.load();

        // Set the stage
        primaryStage.setTitle("JavaFX Application");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }
}


