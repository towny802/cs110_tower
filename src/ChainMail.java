
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class ChainMail extends Armor {

    private int armor = 2;
    private String name = "Chain Mail";
    private char charRepresentation = '(';
    private Image imgRepresentation;

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
