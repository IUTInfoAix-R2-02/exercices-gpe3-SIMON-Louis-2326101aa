package fr.amu.iut.exercice3;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MaPremiereFenetreJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        vbox.setAlignment( Pos.CENTER );

        Label txtBjr = new Label("Bonjour à tous !");
        vbox.getChildren().add( txtBjr );

        TextField nameField = new TextField("Veuillez saisir un nom");
        nameField.setMaxWidth(180.0d);
        nameField.setFont( Font.font("Courier", FontWeight.NORMAL, 12) );
        vbox.getChildren().add( nameField );

        Button button = new Button("Dire bonjour !");
        vbox.getChildren().add( button );

        button.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            txtBjr.setText( "Bonjour à toi, " + nameField.getText() + " !" );
        });

        //D'autres options de codage sonts sur le tp 2.1

        Scene sc1 = new Scene(vbox);
        primaryStage.setWidth( 400 );
        primaryStage.setHeight( 400 );
        primaryStage.setScene(sc1);
        primaryStage.setTitle("Hello application");
        primaryStage.show();
    }
}
