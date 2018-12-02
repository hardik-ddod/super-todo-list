package main.ui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import main.model.ModuleManager;

public class MainApp extends Application {

    private ModuleManager mm = new ModuleManager();

    @Override
    public void start(Stage window) throws Exception {

        Label greeting = new Label("Hey, Daniel!");
        Label administrator = new Label("Administrator");

        Button callMom = new Button("Call Mom");
        Button textMom = new Button("Text Mom");
        Button useToilet = new Button("Use Toilet");
        Button drinkWater = new Button("Drink Water");
        Button eatFood = new Button("Eat Food");
        Button takePhotos = new Button("Take Photos");

        GridPane moduleSelection = new GridPane();
        moduleSelection.setHgap(50);
        moduleSelection.setVgap(50);
        moduleSelection.add(greeting, 1, 0, 3, 1);
        moduleSelection.add(callMom, 0, 0,1,1);
        moduleSelection.add(textMom, 1, 0,1,1);
        moduleSelection.add(useToilet, 2, 0,1,1);
        moduleSelection.add(drinkWater, 0, 1,1,1);
        moduleSelection.add(eatFood, 1, 1,1,1);
        moduleSelection.add(takePhotos, 2, 1,1,1);
        moduleSelection.add(administrator, 2, 3, 1, 1);

        moduleSelection.setStyle("-fx-padding: 40;"
                + "-fx-border-insets: 10;"
        );

        Scene scene = new Scene(moduleSelection);
        scene.getStylesheets().add(getClass().getResource("Stylesheet.css").toExternalForm());
        window.setScene(scene);
        window.setTitle("Task Grid");
        window.show();
    }
}
