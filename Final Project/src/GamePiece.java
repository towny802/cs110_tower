
import java.util.ArrayList;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Ben Specniner
 */
public abstract class GamePiece extends Parent {

    public int[] pos = {0, 0};
    public String name;
    public ImageView view;

    public GamePiece(int[] pos) {
        this.pos[0] = pos[0];
        this.pos[1] = pos[1];
        view = new ImageView(getImgRepresentation());
        view.setX(pos[0] * (640 / 20));
        view.setY(pos[1] * (640 / 20));
        view.setFitHeight(32);
        view.setFitWidth(32);
    }

    public String getName() {
        return name;
    }

    private void move(int[] dir) {
        this.pos[0] += dir[0];
        this.pos[1] += dir[1];
    }

    public void rePos(int[] move, ImageView view) {
        this.move(move);
        double pxx = this.pos[0] * 0.05 * 640;
        double pyy = this.pos[1] * 0.05 * 640;
        view.setX(pxx);
        view.setY(pyy);
    }

    public int getX() {
        return pos[0];
    }

    public int getY() {
        return pos[1];
    }

    public abstract char getCharRepresentation();

    public abstract Image getImgRepresentation();

}
