package ru.mirea.Prakt1112.exercise2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.InputStream;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("Hello from JavaFX!");
        text.setLayoutY(80);    // установка положения надписи по оси Y
        text.setLayoutX(100);   // установка положения надписи по оси X

        Group group = new Group(text);

        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Калькулятор");
        primaryStage.setWidth(300);
        primaryStage.setHeight(250);

        primaryStage.getIcons().add(new Image(Calculator.class.getResourceAsStream( "ico.png" )));

        primaryStage.show();
    }
}
