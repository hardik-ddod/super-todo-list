package main.ui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AdminPage extends Application {

    private static Stage window = new Stage();

    public static Stage getStage() {
        return window;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Button goback = new Button("Back");
        goback.setOnAction(event -> {
            new MainApp();
        });

    }
}
