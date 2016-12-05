
import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Ben Spenciner
 */
public class TowerModel {

    public GamePiece[] floor0 = {new Bandit(new int[]{5, 10}), new Bandit(new int[]{6, 10}), new Goblin(new int[]{7, 10}), new Bandit(new int[]{8, 10}), new Bandit(new int[]{9, 10}), new Bandit(new int[]{10, 10}), new upLadder(new int[]{1, 1}), new Wall(new int[]{0, 0}), new Wall(new int[]{0, 1}), new Wall(new int[]{0, 2}), new Wall(new int[]{0, 3}), new Wall(new int[]{0, 4}), new Wall(new int[]{0, 5}), new Wall(new int[]{0, 6}), new Wall(new int[]{0, 7}), new Wall(new int[]{0, 8}), new Wall(new int[]{0, 9}), new Wall(new int[]{0, 10}), new Wall(new int[]{0, 11}), new Wall(new int[]{0, 12}), new Wall(new int[]{0, 13}), new Wall(new int[]{0, 14}), new Wall(new int[]{0, 15}), new Wall(new int[]{0, 16}), new Wall(new int[]{0, 17}), new Wall(new int[]{0, 18}), new Wall(new int[]{0, 19}), new Wall(new int[]{1, 0}), new Wall(new int[]{2, 0}), new Wall(new int[]{3, 0}), new Wall(new int[]{4, 0}), new Wall(new int[]{5, 0}), new Wall(new int[]{6, 0}), new Wall(new int[]{7, 0}), new Wall(new int[]{8, 0}), new Wall(new int[]{9, 0}), new Wall(new int[]{10, 0}), new Wall(new int[]{11, 0}), new Wall(new int[]{12, 0}), new Wall(new int[]{13, 0}), new Wall(new int[]{14, 0}), new Wall(new int[]{15, 0}), new Wall(new int[]{16, 0}), new Wall(new int[]{17, 0}), new Wall(new int[]{18, 0}), new Wall(new int[]{19, 0}), new Wall(new int[]{19, 1}), new Wall(new int[]{19, 2}), new Wall(new int[]{19, 3}), new Wall(new int[]{19, 4}), new Wall(new int[]{19, 5}), new Wall(new int[]{19, 6}), new Wall(new int[]{19, 7}), new Wall(new int[]{19, 8}), new Wall(new int[]{19, 9}), new Wall(new int[]{19, 10}), new Wall(new int[]{19, 11}), new Wall(new int[]{19, 12}), new Wall(new int[]{19, 13}), new Wall(new int[]{19, 14}), new Wall(new int[]{19, 15}), new Wall(new int[]{19, 16}), new Wall(new int[]{19, 17}), new Wall(new int[]{19, 18}), new Wall(new int[]{19, 19}), new Wall(new int[]{1, 19}), new Wall(new int[]{2, 19}), new Wall(new int[]{3, 19}), new Wall(new int[]{4, 19}), new Wall(new int[]{5, 19}), new Wall(new int[]{6, 19}), new Wall(new int[]{7, 19}), new Wall(new int[]{8, 19}), new Wall(new int[]{9, 19}), new Wall(new int[]{10, 19}), new Wall(new int[]{11, 19}), new Wall(new int[]{12, 19}), new Wall(new int[]{13, 19}), new Wall(new int[]{14, 19}), new Wall(new int[]{15, 19}), new Wall(new int[]{16, 19}), new Wall(new int[]{17, 19}), new Wall(new int[]{18, 19})};
    public GamePiece[] floor1 = {new Bandit(new int[]{13, 11}), new Bandit(new int[]{10, 13}), new Goblin(new int[]{15, 13}), new Bandit(new int[]{4, 16}), new HugeRat(new int[]{11, 1}), new UltraSlime(new int[]{7, 1}), new upLadder(new int[]{18, 17}), //Creatures and items
    		new Wall(new int[]{6, 1}), new Wall(new int[]{6, 2}), new Wall(new int[]{7, 2}), new Wall(new int[]{7, 3}), new Wall(new int[]{8, 3}), new Wall(new int[]{9, 3}), new Wall(new int[]{10, 3}), new Wall(new int[]{11, 3}), new Wall(new int[]{12, 3}), new Wall(new int[]{13, 3}), new Wall(new int[]{17, 3}), new Wall(new int[]{18, 3}),
    		new Wall(new int[]{7, 6}), new Wall(new int[]{8, 6}), new Wall(new int[]{9, 6}), new Wall(new int[]{10, 6}), new Wall(new int[]{11, 6}), new Wall(new int[]{12, 6}), new Wall(new int[]{13, 6}), new Wall(new int[]{17, 6}), new Wall(new int[]{18, 6}),
    		new Wall(new int[]{3, 6}), new Wall(new int[]{3, 7}), new Wall(new int[]{3, 8}), new Wall(new int[]{3, 9}), new Wall(new int[]{4, 9}), new Wall(new int[]{5, 9}),
    		new Wall(new int[]{3, 12}), new Wall(new int[]{4, 12}), new Wall(new int[]{5, 12}), new Wall(new int[]{5, 13}), new Wall(new int[]{5, 14}), new Wall(new int[]{5, 16}), new Wall(new int[]{6, 17}), new Wall(new int[]{7, 17}), new Wall(new int[]{8, 17}),
    		new Wall(new int[]{14, 16}), new Wall(new int[]{15, 16}), new Wall(new int[]{16, 16}), new Wall(new int[]{17, 16}), new Wall(new int[]{18, 16}),
    		new Wall(new int[]{0, 0}), new Wall(new int[]{0, 0}), new Wall(new int[]{0, 1}), new Wall(new int[]{0, 2}), new Wall(new int[]{0, 3}), new Wall(new int[]{0, 4}), new Wall(new int[]{0, 5}), new Wall(new int[]{0, 6}), new Wall(new int[]{0, 7}), new Wall(new int[]{0, 8}), new Wall(new int[]{0, 9}), new Wall(new int[]{0, 10}), new Wall(new int[]{0, 11}), new Wall(new int[]{0, 12}), new Wall(new int[]{0, 13}), new Wall(new int[]{0, 14}), new Wall(new int[]{0, 15}), new Wall(new int[]{0, 16}), new Wall(new int[]{0, 17}), new Wall(new int[]{0, 18}), new Wall(new int[]{0, 19}), new Wall(new int[]{1, 0}), new Wall(new int[]{2, 0}), new Wall(new int[]{3, 0}), new Wall(new int[]{4, 0}), new Wall(new int[]{5, 0}), new Wall(new int[]{6, 0}), new Wall(new int[]{7, 0}), new Wall(new int[]{8, 0}), new Wall(new int[]{9, 0}), new Wall(new int[]{10, 0}), new Wall(new int[]{11, 0}), new Wall(new int[]{12, 0}), new Wall(new int[]{13, 0}), new Wall(new int[]{14, 0}), new Wall(new int[]{15, 0}), new Wall(new int[]{16, 0}), new Wall(new int[]{17, 0}), new Wall(new int[]{18, 0}), new Wall(new int[]{19, 0}), new Wall(new int[]{19, 1}), new Wall(new int[]{19, 2}), new Wall(new int[]{19, 3}), new Wall(new int[]{19, 4}), new Wall(new int[]{19, 5}), new Wall(new int[]{19, 6}), new Wall(new int[]{19, 7}), new Wall(new int[]{19, 8}), new Wall(new int[]{19, 9}), new Wall(new int[]{19, 10}), new Wall(new int[]{19, 11}), new Wall(new int[]{19, 12}), new Wall(new int[]{19, 13}), new Wall(new int[]{19, 14}), new Wall(new int[]{19, 15}), new Wall(new int[]{19, 16}), new Wall(new int[]{19, 17}), new Wall(new int[]{19, 18}), new Wall(new int[]{19, 19}), new Wall(new int[]{1, 19}), new Wall(new int[]{2, 19}), new Wall(new int[]{3, 19}), new Wall(new int[]{4, 19}), new Wall(new int[]{5, 19}), new Wall(new int[]{6, 19}), new Wall(new int[]{7, 19}), new Wall(new int[]{8, 19}), new Wall(new int[]{9, 19}), new Wall(new int[]{10, 19}), new Wall(new int[]{11, 19}), new Wall(new int[]{12, 19}), new Wall(new int[]{13, 19}), new Wall(new int[]{14, 19}), new Wall(new int[]{15, 19}), new Wall(new int[]{16, 19}), new Wall(new int[]{17, 19}), new Wall(new int[]{18, 19})};
    public GamePiece[] floor2;
    public GamePiece[] floor3;

    ArrayList<GamePiece> occupants = new ArrayList<>();
    public GamePiece[][] obstructions = new GamePiece[21][21];
    public ArrayList<GamePiece[]> floors = new ArrayList<>();

    public void AllocateFloor(GamePiece[] floor, ArrayList<GamePiece> occupants, Pane pane) {
        floors.add(floor0);
        floors.add(floor1);
        floors.add(floor2);
        floors.add(floor3);
        for (int i = 0; i < floor.length; i++) {
            occupants.add(floor[i]);
            occupants.get(i).view.setImage(occupants.get(i).getImgRepresentation());
            pane.getChildren().add(occupants.get(i).view);
            obstructions[occupants.get(i).pos[0]][occupants.get(i).pos[1]] = floor[i];
        }
    }

    public void travelFloor(int index, Player hero, Pane pane, ImageView floor) {
        occupants.clear();
        pane.getChildren().clear();
        pane.getChildren().add(hero.view);
        pane.getChildren().add(floor);

        switch (index) {
            case 0:
                RunGame.index = 1;
                AllocateFloor(floor0, occupants, pane);
                break;
            case 1:
                RunGame.index = 2;
                AllocateFloor(floor1, occupants, pane);
                break;
            case 2:
                RunGame.index = 3;
                AllocateFloor(floor2, occupants, pane);
                break;
            case 3:
                RunGame.index = 0;
                AllocateFloor(floor3, occupants, pane);
                break;
        }
    }
}
