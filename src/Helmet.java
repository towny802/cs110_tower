
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Helmet extends Armor {

    private int armor = 2;
    private String name = "Helmet";
    private char charRepresentation = 'H';
    private Image imgRepresentation = new Image("helmet.png");

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
