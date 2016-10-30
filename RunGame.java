
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Ben Spenciner
 */
public class RunGame extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Image image1 = new Image("tile.png");
        Image image2 = new Image("tile2.png");
        ImageView iv1 = new ImageView();
        ImageView iv2 = new ImageView();
        iv1.setImage(image1);
        iv2.setImage(image2);
        iv1.setFitWidth(32);
        iv1.setFitHeight(32);
        iv1.setX(304);
        iv1.setY(304);
        iv2.setFitWidth(32);
        iv2.setFitHeight(32);
        iv2.setX(304);
        iv2.setY(304);

        pane.getChildren().addAll(iv2,iv1);
        Scene scene = new Scene(pane, 640, 640);
        primaryStage.setTitle("Final Project");
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();

        iv1.setOnKeyPressed((KeyEvent e) -> {
            double temp,temp1;
            switch (e.getCode()) {
                case UP:
                    temp = iv1.getY();
                    temp -= 32;
                    if (temp > 0) {
                        iv1.setY(temp);
//                        hero.move();
                    }
                    break;
                case DOWN:
                    temp = iv1.getY();
                    temp += 32;
                    if (temp < 624) {
                        iv1.setY(temp);
                    }
                    break;
                case LEFT:
                    temp = iv1.getX();
                    temp -= 32;
                    if (temp > 0) {
                        iv1.setX(temp);
                    }
                    break;
                case RIGHT:
                    temp = iv1.getX();
                    temp += 32;
                    if (temp < 624) {
                        iv1.setX(temp);
                    }
                    break;
                case Y:
                    temp = iv1.getX();
                    temp -= 32;
                    temp1 = iv1.getY();
                    temp1 -= 32;
                    if ((temp > 0) && (temp1 > 0)) {
                        iv1.setX(temp);
                        iv1.setY(temp1);
                    }
                    break;
                case U:
                    temp = iv1.getX();
                    temp += 32;
                    temp1 = iv1.getY();
                    temp1 -= 32;
                    if ((temp < 624) && (temp1 > 0)) {
                        iv1.setX(temp);
                        iv1.setY(temp1);
                    }
                    break;
                case B:
                    temp = iv1.getX();
                    temp -= 32;
                    temp1 = iv1.getY();
                    temp1 += 32;
                    if ((temp > 0) && (temp1 < 624)) {
                        iv1.setX(temp);
                        iv1.setY(temp1);
                    }
                    break;
                case N:
                    temp = iv1.getX();
                    temp += 32;
                    temp1 = iv1.getY();
                    temp1 += 32;
                    if ((temp < 624) && (temp1 < 624)) {
                        iv1.setX(temp);
                        iv1.setY(temp1);
                    }
                    break;
                case ESCAPE:
                    break;
                default:
                    System.out.println("Key not recognised.");
            }
        });
        iv1.requestFocus();
    }

    public static void main(String[] args) {
        TowerModel tower = new TowerModel();
        tower.AllocateFloor(tower.floor0);
        Player hero = new Player();
        Application.launch(args);
    }
}
