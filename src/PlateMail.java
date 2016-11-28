
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class PlateMail extends Armor {

    private int armor = 3;
    private String name = "Plate Mail";
    private char charRepresentation = '|';
    private Image imgRepresentation = new Image("platemail.png");

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
