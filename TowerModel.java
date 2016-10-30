
import java.util.ArrayList;

/**
 *
 * @author Ben Spenciner
 */
public class TowerModel {

    public int[] exit = {20,10};
    public int[] entry = {0,10};
    public GamePiece[] floor0 = {new GamePiece(new int[]{3,4}),new GamePiece(new int[]{4,3}),new GamePiece(new int[]{5,5})};

    ArrayList<GamePiece> occupants = new ArrayList<>();

    public GamePiece[][] floor = new GamePiece[21][21];

    public void AllocateFloor(GamePiece[] level) {
        for (int i = 0; i < level.length; i++) {
            this.occupants.add(level[i]);
        }
    }

    public void TravelFloor(int dir, Player hero){
        if (dir > 0){
            hero.pos[0] = entry[0];
            hero.pos[1] = entry[1];
        } else {
            hero.pos[0] = exit[0];
            hero.pos[1] = exit[1];
        }
    }
}
