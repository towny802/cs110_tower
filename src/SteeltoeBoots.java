
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class SteeltoeBoots extends Armor {

    private int armor = 2;
    private String name = "Steel-toe Boots";
    private char charRepresentation = 'T';
    private Image imgRepresentation = new Image("steeltoeboots.png");

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
