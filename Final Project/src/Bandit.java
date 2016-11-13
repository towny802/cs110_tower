
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Bandit extends Creature {

    private char charRepresentation = 'b';
    private Image imgRepresentation = new Image("tile2.png");

    public Bandit(int[] pos) {
        super(pos);
    }

    @Override
    public char getCharRepresentation() {
        return charRepresentation;
    }

    @Override
    public Image getImgRepresentation() {
        return imgRepresentation;
    }

    public void setCharRepresentation(char charRepresentation) {
        this.charRepresentation = charRepresentation;
    }

    public void setImgRepresentation(Image imgRepresentation) {
        this.imgRepresentation = imgRepresentation;
    }
}
