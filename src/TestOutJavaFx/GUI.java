package TestOutJavaFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        // Getting loader and a pane for Main Login page.
        // Loader will then give a possibility to get related controller
        FXMLLoader firstPaneLoader = new FXMLLoader(getClass().getResource("GUI.fxml"));
        Parent firstPane = firstPaneLoader.load();
        Scene firstScene = new Scene(firstPane, 600, 400);

        // Getting loader and a pane for Registration Page
        FXMLLoader secondPageLoader = new FXMLLoader(getClass().getResource("REGISTER.fxml"));
        Parent secondPane = secondPageLoader.load();
        Scene secondScene = new Scene(secondPane, 600, 400);

        // Injecting second scene into the controller of the first scene
        GUIController firstPaneController =  firstPaneLoader.getController();
        firstPaneController.setSecondScene(secondScene);

        // Injecting first scene into the controller of the second scene
        REGISTERController secondPaneController = secondPageLoader.getController();
        secondPaneController.setFirstScene(firstScene);

        primaryStage.setTitle("Main menu");

        primaryStage.setScene(firstScene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}