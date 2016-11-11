
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
    public GamePiece[] floor0 = {new upLadder(exit), new downLadder(entry)};
    ArrayList<GamePiece> occupants = new ArrayList<>();

    public GamePiece[][] floor = new GamePiece[19][19];

    public void AllocateFloor(GamePiece[] floor, ArrayList<GamePiece> occupants, Pane pane) {
        for (int i = 0; i < floor.length; i++) {
            occupants.add(floor[i]);
            System.out.println(occupants.get(i).view);
            occupants.get(i).view.setImage(occupants.get(i).getImgRepresentation());
            pane.getChildren().add(occupants.get(i).view);
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
