
import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
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

        TowerModel tower = new TowerModel();
        Player hero = new Player(new int[]{1, 1});
        Pane pane = new Pane();

        tower.AllocateFloor(tower.floor0, tower.occupants, pane);
        ImageView iv1 = new ImageView();

        iv1.setImage(hero.getImgRepresentation());
        iv1.setFitWidth(32);
        iv1.setFitHeight(32);
        iv1.setX(hero.pos[0] * (640 / 20));
        iv1.setY(hero.pos[1] * (640 / 20));

        pane.getChildren().add(iv1);

        Scene scene = new Scene(pane, 640, 640);
        primaryStage.setTitle("Final Project");
        primaryStage.setScene(scene);
//        primaryStage.setFullScreen(true);
        primaryStage.show();

        iv1.setOnKeyPressed((KeyEvent e) -> {
            switch (e.getCode()) {
                case UP:
                    if (!(tower.obstructions[hero.pos[0]][hero.pos[1] - 1] instanceof Wall)) {
                        int[] move = {0, -1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case DOWN:
                    if (!(tower.obstructions[hero.pos[0]][hero.pos[1] + 1] instanceof Wall)) {
                        int[] move = {0, 1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case LEFT:
                    if (!(tower.obstructions[hero.pos[0] - 1][hero.pos[1]] instanceof Wall)) {
                        int[] move = {-1, 0};
                        hero.rePos(move, iv1);
                    }
                    break;
                case RIGHT:
                    if (!(tower.obstructions[hero.pos[0] + 1][hero.pos[1]] instanceof Wall)) {
                        int[] move = {1, 0};
                        hero.rePos(move, iv1);
                    }
                    break;
                case Y:
                    if (!(tower.obstructions[hero.pos[0] - 1][hero.pos[1] - 1] instanceof Wall)) {
                        int[] move = {-1, -1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case U:
                    if (!(tower.obstructions[hero.pos[0] + 1][hero.pos[1] - 1] instanceof Wall)) {
                        int[] move = {1, -1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case B:
                    if (!(tower.obstructions[hero.pos[0] - 1][hero.pos[1] + 1] instanceof Wall)) {
                        int[] move = {-1, 1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case N:
                    if (!(tower.obstructions[hero.pos[0] + 1][hero.pos[1] + 1] instanceof Wall)) {
                        int[] move = {1, 1};
                        hero.rePos(move, iv1);
                    }
                    break;
                case ESCAPE:
                    break;
                default:
                    System.out.println("Key not mapped.");
            }
            System.out.println(Arrays.toString(hero.pos));
        });
        iv1.requestFocus();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
