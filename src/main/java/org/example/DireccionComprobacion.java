package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class DireccionComprobacion extends Application {
    public void start(Stage stage){

        TextField campo = new TextField();

        Label etiqueta = new Label();

        Label informacion = new Label();
        informacion.setText("Introduzca la direccion:");

        Button boton = new Button("Comprar");
        boton.setOnAction(e -> {etiqueta.setText("Direccion guardada");});

        VBox root = new VBox(10, informacion, campo, boton, etiqueta);

        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("Direccion Comprobacion");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}