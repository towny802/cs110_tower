
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class WarHelm extends Armor {

    private int armor = 3;
    private String name = "War Helm";
    private char charRepresentation = 'W';
    private Image imgRepresentation = new Image("warhelm.png");

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
