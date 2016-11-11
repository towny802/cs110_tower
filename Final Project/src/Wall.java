
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Wall extends GamePiece {

    private char charRepresentation = '#';
    private Image imgRepresentation = new Image("tile.png");

    public Wall(int[] pos) {
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
