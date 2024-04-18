package fr.amu.iut.exercice5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class JeuMain extends Application {

    private Scene scene;
    private BorderPane root;

    @Override
    public void start(Stage primaryStage) {

        root = new BorderPane();

        //Acteurs du jeu
        Personnage pacman = new Pacman();
        Personnage fantome = new Fantome();
        ArrayList AraObstacle = new ArrayList<Obstacle>();
        Obstacle mur = new Obstacle();
        mur.setLayoutX(40);
        mur.setLayoutY(40);
        mur.setHeight(100);
        mur.setWidth(20);
        Obstacle mur2 = new Obstacle();
        mur2.setLayoutX(180);
        mur2.setLayoutY(240);
        mur2.setHeight(20);
        mur2.setWidth(120);
        Obstacle mur3 = new Obstacle();
        mur3.setLayoutX(40);
        mur3.setLayoutY(340);
        mur3.setHeight(100);
        mur3.setWidth(20);
        Obstacle mur4 = new Obstacle();
        mur4.setLayoutX(120);
        mur4.setLayoutY(40);
        mur4.setHeight(400);
        mur4.setWidth(20);
        // on positionne le fantôme 20 positions vers la droite
        fantome.setLayoutX(20 * 10);
        //panneau du jeu
        Pane jeu = new Pane();
        jeu.setPrefSize(640, 480);
        jeu.getChildren().add(pacman);
        jeu.getChildren().add(fantome);
        jeu.getChildren().add(mur);
        jeu.getChildren().add(mur2);
        jeu.getChildren().add(mur3);
        jeu.getChildren().add(mur4);
        root.setCenter(jeu);
        //on construit une scene 640 * 480 pixels
        scene = new Scene(root);

        //Gestion du déplacement du personnage
        deplacer(pacman, fantome, AraObstacle);

        primaryStage.setTitle("... Pac Man ...");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Permet de gérer les événements de type clavier, pression des touches
     * pour le j1(up,down, right, left), pour le j2( z,q,s,d)
     *
     * @param j1
     * @param j2
     * @param araObstacle
     */
    private void deplacer(Personnage j1, Personnage j2, ArrayList araObstacle) {
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case LEFT:
                    j1.deplacerAGauche();
                    break;
                case RIGHT:
                    j1.deplacerADroite(scene.getWidth());
                    break;
                case UP:
                    j1.deplacerEnHaut();
                    break;
                case DOWN:
                    j1.deplacerEnBas(scene.getHeight());
                    break;
                case Z:
                    j2.deplacerEnHaut();
                    break;
                case S:
                    j2.deplacerEnBas(scene.getHeight());
                    break;
                case Q:
                    j2.deplacerAGauche();
                    break;
                case D:
                    j2.deplacerADroite(scene.getWidth());
                    break;

            }
            if (j1.estEnCollision(j2)) {
                System.out.println("Collision....");
                javafx.application.Platform.exit();
            }
        });
    }


}
