package main.ui;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

import java.awt.image.BufferedImage;

public class Alert {

    public void display(String message, Image image) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Initializing...");
        window.setMinWidth(250);

        Label label = new Label(message);
        label.setId("header");
        Button closeButton = new Button("Back");
        closeButton.setId("regular");

        closeButton.setOnAction(e -> window.close());

        final ImageView selectedImage = new ImageView();
        selectedImage.setImage(image);
        selectedImage.setFitWidth(200);
        selectedImage.setFitHeight(200);
        selectedImage.setSmooth(true);
        selectedImage.setCache(true);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, selectedImage, closeButton);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-padding: 20;"
                + "-fx-border-insets: 5;"
        );

        Scene scene = new Scene(layout);
        scene.getStylesheets().add(
                getClass().getResource("Stylesheet.css").toExternalForm()
        );
        window.setScene(scene);
        window.showAndWait();
    }

}