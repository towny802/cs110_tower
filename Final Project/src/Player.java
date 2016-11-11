
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Player extends GamePiece {

    private char charRepresentation = 'X';
    private Image imgRepresentation = new Image("tile2.png");

    public Player(int[] pos) {
        super(pos);
    }

    public void setCharRepresentation(char charRepresentation) {
        this.charRepresentation = charRepresentation;
    }

    public void setImgRepresentation(Image imgRepresentation) {
        this.imgRepresentation = imgRepresentation;
    }

    @Override
    public char getCharRepresentation() {
        return charRepresentation;
    }

    @Override
    public Image getImgRepresentation() {
        return imgRepresentation;
    }
}
