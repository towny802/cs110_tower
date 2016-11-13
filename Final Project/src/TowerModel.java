
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Ben Spenciner
 */
public class TowerModel {

    public int[] exit = {20, 10};
    public int[] entry = {0, 10};

    public GamePiece[] floor0 = {new Bandit(new int[]{10, 10}), new upLadder(new int[]{15, 10}), new downLadder(new int[]{2, 3}), new Wall(new int[]{0, 0}), new Wall(new int[]{0, 1}), new Wall(new int[]{0, 2}), new Wall(new int[]{0, 3}), new Wall(new int[]{0, 4}), new Wall(new int[]{0, 5}), new Wall(new int[]{0, 6}), new Wall(new int[]{0, 7}), new Wall(new int[]{0, 8}), new Wall(new int[]{0, 9}), new Wall(new int[]{0, 10}), new Wall(new int[]{0, 11}), new Wall(new int[]{0, 12}), new Wall(new int[]{0, 13}), new Wall(new int[]{0, 14}), new Wall(new int[]{0, 15}), new Wall(new int[]{0, 16}), new Wall(new int[]{0, 17}), new Wall(new int[]{0, 18}), new Wall(new int[]{0, 19}), new Wall(new int[]{1, 0}), new Wall(new int[]{2, 0}), new Wall(new int[]{3, 0}), new Wall(new int[]{4, 0}), new Wall(new int[]{5, 0}), new Wall(new int[]{6, 0}), new Wall(new int[]{7, 0}), new Wall(new int[]{8, 0}), new Wall(new int[]{9, 0}), new Wall(new int[]{10, 0}), new Wall(new int[]{11, 0}), new Wall(new int[]{12, 0}), new Wall(new int[]{13, 0}), new Wall(new int[]{14, 0}), new Wall(new int[]{15, 0}), new Wall(new int[]{16, 0}), new Wall(new int[]{17, 0}), new Wall(new int[]{18, 0}), new Wall(new int[]{19, 0}), new Wall(new int[]{19, 1}), new Wall(new int[]{19, 2}), new Wall(new int[]{19, 3}), new Wall(new int[]{19, 4}), new Wall(new int[]{19, 5}), new Wall(new int[]{19, 6}), new Wall(new int[]{19, 7}), new Wall(new int[]{19, 8}), new Wall(new int[]{19, 9}), new Wall(new int[]{19, 10}), new Wall(new int[]{19, 11}), new Wall(new int[]{19, 12}), new Wall(new int[]{19, 13}), new Wall(new int[]{19, 14}), new Wall(new int[]{19, 15}), new Wall(new int[]{19, 16}), new Wall(new int[]{19, 17}), new Wall(new int[]{19, 18}), new Wall(new int[]{19, 19}), new Wall(new int[]{1, 19}), new Wall(new int[]{2, 19}), new Wall(new int[]{3, 19}), new Wall(new int[]{4, 19}), new Wall(new int[]{5, 19}), new Wall(new int[]{6, 19}), new Wall(new int[]{7, 19}), new Wall(new int[]{8, 19}), new Wall(new int[]{9, 19}), new Wall(new int[]{10, 19}), new Wall(new int[]{11, 19}), new Wall(new int[]{12, 19}), new Wall(new int[]{13, 19}), new Wall(new int[]{14, 19}), new Wall(new int[]{15, 19}), new Wall(new int[]{16, 19}), new Wall(new int[]{17, 19}), new Wall(new int[]{18, 19})};
    ArrayList<GamePiece> occupants = new ArrayList<>();

    public GamePiece[][] obstructions = new GamePiece[21][21];

    public void AllocateFloor(GamePiece[] floor, ArrayList<GamePiece> occupants, Pane pane) {
        for (int i = 0; i < floor.length; i++) {
            occupants.add(floor[i]);
            System.out.println(occupants.get(i).view);
            occupants.get(i).view.setImage(occupants.get(i).getImgRepresentation());
            pane.getChildren().add(occupants.get(i).view);
            if (occupants.get(i) instanceof Wall) {
                obstructions[occupants.get(i).pos[0]][occupants.get(i).pos[1]] = floor[i];
            }
        }
    }

    public void travelFloor(int dir, Player hero) {
        if (dir > 0) {
            hero.pos[0] = entry[0];
            hero.pos[1] = entry[1];
        } else {
            hero.pos[0] = exit[0];
            hero.pos[1] = exit[1];
        }
    }
}
