
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class ClothHat extends Armor {

    private int armor = 1;
    private String name = "Cloth Hat";
    private char charRepresentation = 'h';
    private Image imgRepresentation = new Image("clothhat.png");

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
