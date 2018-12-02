package main.ui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import main.model.ModuleManager;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

public class MainApp extends Application {

    private ModuleManager mm = new ModuleManager();

    @Override
    public void start(Stage window) throws Exception {

        Label greeting = new Label("Hey, Daniel!");
        greeting.setAlignment(Pos.CENTER);

        Image callDisplay = new Image(new FileInputStream("/Users/angellidimatulac/Desktop/UBCLocalHackDay/super-todo-list/resources/telephone.png"));
        Image textMessage = new Image(new FileInputStream("/Users/angellidimatulac/Desktop/UBCLocalHackDay/super-todo-list/resources/chat.png"));
        Image toilet = new Image(new FileInputStream("/Users/angellidimatulac/Desktop/UBCLocalHackDay/super-todo-list/resources/toilet.png"));
        Image waterBottle = new Image(new FileInputStream("/Users/angellidimatulac/Desktop/UBCLocalHackDay/super-todo-list/resources/water.png"));
        Image pizza = new Image(new FileInputStream("/Users/angellidimatulac/Desktop/UBCLocalHackDay/super-todo-list/resources/pizza.png"));
        Image camera = new Image(new FileInputStream("/Users/angellidimatulac/Desktop/UBCLocalHackDay/super-todo-list/resources/camera.png"));


        Button callMom = new Button();
        final ImageView callDisplayImage = new ImageView();
        callDisplayImage.setImage(callDisplay);
        setSpecs(callDisplayImage);
        callMom.setGraphic(callDisplayImage);

        Button textMom = new Button();
        final ImageView textDisplayImage = new ImageView();
        textDisplayImage.setImage(textMessage);
        setSpecs(textDisplayImage);
        textMom.setGraphic(textDisplayImage);

        Button useToilet = new Button();
        final ImageView toiletDisplayImage = new ImageView();
        toiletDisplayImage.setImage(toilet);
        setSpecs(toiletDisplayImage);
        useToilet.setGraphic(toiletDisplayImage);

        Button drinkWater = new Button();
        final ImageView waterBottleDisplayImage = new ImageView();
        waterBottleDisplayImage.setImage(waterBottle);
        setSpecs(waterBottleDisplayImage);
        drinkWater.setGraphic(waterBottleDisplayImage);

        Button eatFood = new Button();
        final ImageView eatFoodDisplayImage = new ImageView();
        eatFoodDisplayImage.setImage(pizza);
        setSpecs(eatFoodDisplayImage);
        eatFood.setGraphic(eatFoodDisplayImage);

        Button takePhotos = new Button();
        final ImageView cameraDisplayImage = new ImageView();
        cameraDisplayImage.setImage(camera);
        setSpecs(cameraDisplayImage);
        takePhotos.setGraphic(cameraDisplayImage);

        Button administrator = new Button("Administrator");
        administrator.setId("regular");

        callMom.setOnAction(event -> {
            new Alert().display("Calling mom...", callDisplay);
        });
        textMom.setOnAction(event -> {
            new Alert().display("Texting mom...", callDisplay);
        });
        useToilet.setOnAction(event -> {
            new Alert().display("Texting mom...", callDisplay);
        });
        drinkWater.setOnAction(event -> {
            new Alert().display("Texting mom...", callDisplay);
        });
        eatFood.setOnAction(event -> {
            new Alert().display("Texting mom...", callDisplay);
        });
        takePhotos.setOnAction(event -> {
            new Alert().display("Opening photo app...", callDisplay);
        });

        administrator.setOnAction(event -> {

        });

        GridPane moduleSelection = new GridPane();
        moduleSelection.setHgap(40);
        moduleSelection.setVgap(40);
        moduleSelection.add(greeting, 0, 0, 3, 1);
        moduleSelection.add(callMom, 0, 1,1,1);
        moduleSelection.add(textMom, 1, 1,1,1);
        moduleSelection.add(useToilet, 2, 1,1,1);
        moduleSelection.add(drinkWater, 0, 2,1,1);
        moduleSelection.add(eatFood, 1, 2,1,1);
        moduleSelection.add(takePhotos, 2, 2,1,1);
        moduleSelection.add(administrator, 2, 4, 1, 1);

        moduleSelection.setStyle("-fx-padding: 20 20 10 20;"
                + "-fx-border-insets: 10;"
        );

        Scene scene = new Scene(moduleSelection);
        scene.getStylesheets().add(getClass().getResource("Stylesheet.css").toExternalForm());
        window.setScene(scene);
        window.setTitle("Task Grid");
        window.show();
    }

    private void setSpecs(ImageView imageView) {
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        imageView.setSmooth(true);
        imageView.setCache(true);
    }
}
