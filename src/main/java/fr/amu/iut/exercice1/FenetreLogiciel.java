package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FenetreLogiciel extends Application {

    @Override
    public void start(Stage primaryStage) {
        // code de l'exercice 1
        Button b1 = new Button("Bouton 1");
        Button b2 = new Button("Bouton 2");
        Button b3 = new Button("Bouton 3");
        Button bS = new Button("Submit");
        Button bC = new Button("Cancel");

        Label bouton = new Label("  Boutons:");
        Label name = new Label("Name:");
        Label email = new Label("Email:");
        Label password = new Label("Password:");
        Label space1 = new Label("  ");
        Label space2 = new Label(" ");
        Label spB1 = new Label(" ");
        Label spB2 = new Label(" ");
        Label spB3 = new Label(" ");

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("edit");
        Menu menu3 = new Menu("Help");

        SeparatorMenuItem sep = new SeparatorMenuItem();
        SeparatorMenuItem sep2 = new SeparatorMenuItem();
        SeparatorMenuItem sep3 = new SeparatorMenuItem();
        SeparatorMenuItem sep4 = new SeparatorMenuItem();
        SeparatorMenuItem sep5 = new SeparatorMenuItem();
        Separator sepbas = new Separator(Orientation.HORIZONTAL);

        MenuItem new1 = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem close = new MenuItem("Close");
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");

        menu1.getItems().addAll(new1, sep, open, sep2, save, sep3, close);
        menu2.getItems().addAll(cut, sep4, copy, sep5, paste);
        MenuBar menuBar = new MenuBar(menu1, menu2, menu3);

        Label basdepage = new Label("Ceci est un label de bas de page");

        TextField zN = new TextField(" ");
        TextField zE = new TextField(" ");
        TextField zP = new TextField(" ");

        GridPane logpane = new GridPane();
        logpane.getChildren().addAll(name, email, password, zN, zE, zP);
        GridPane.setConstraints(name, 0, 0);
        GridPane.setConstraints(email, 0, 1);
        GridPane.setConstraints(password, 0, 2);
        GridPane.setConstraints(zN, 1, 0);
        GridPane.setConstraints(zE, 1, 1);
        GridPane.setConstraints(zP, 1, 2);
        logpane.setVgap(10);
        logpane.setHgap(10);
        logpane.setAlignment( Pos.CENTER );


        HBox subbox = new HBox(bS, space1, bC);
        subbox.setAlignment( Pos.CENTER );

        HBox menum = new HBox(menuBar);
        menum.setAlignment( Pos.TOP_LEFT );

        Separator s1 = new Separator(Orientation.VERTICAL);
        VBox listeb = new VBox(bouton, spB1,  b1, spB2, b2, spB3, b3);
        HBox listebH = new HBox(listeb, s1);
        listeb.setAlignment( Pos.CENTER_LEFT );

        VBox bdp = new VBox(sepbas, basdepage);
        bdp.setAlignment( Pos.CENTER );

        VBox logb = new VBox(logpane,space2 , subbox);
        logb.setAlignment( Pos.CENTER );


        BorderPane bp1 = new BorderPane();
        bp1.setLeft(listebH);
        bp1.setTop(menuBar);
        bp1.setBottom(bdp);
        bp1.setCenter(logb);

        Scene  sc1 = new Scene(bp1);
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Test Des Scenes");// Hauteur et largeur
        primaryStage.setScene(sc1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}

