package fr.amu.iut.exercice4;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.panneau = new Pane();
        this.label = new Label("");


        this.vert = new Button("Vert");
        this.nbVert = nbVert;

        vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            nbVert = nbVert +1;
            panneau.setStyle("-fx-background-color: green");
            label.setText("Vert choisi " + nbVert + " fois");
                });

        this.rouge = new Button("Rouge");
        this.nbRouge = nbRouge;

        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            nbRouge = nbRouge +1;
            panneau.setStyle("-fx-background-color: red");
            label.setText("Rouge choisi " + nbRouge + " fois");
        });

        this.bleu = new Button("Bleu");
        this.nbBleu = nbBleu;

        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            nbBleu = nbBleu +1;
            panneau.setStyle("-fx-background-color: blue");
            label.setText("Bleu choisi " + nbBleu + " fois");
        });
        Label sp1 = new Label ("  ");
        Label sp2 = new Label ("  ");
        HBox hbas = new HBox(vert, sp1, rouge, sp2, bleu);
        hbas.setAlignment( Pos.CENTER );
        HBox hlab = new HBox(label);
        hlab.setAlignment( Pos.CENTER );

        this.root = new BorderPane();
        root.setTop(hlab);
        root.setBottom(hbas);
        root.setCenter(panneau);

        Scene sc1 = new Scene(root);
        primaryStage.setWidth( 400 );
        primaryStage.setHeight( 400 );
        primaryStage.setScene(sc1);
        primaryStage.show();
    }
}

