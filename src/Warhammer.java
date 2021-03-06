
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Warhammer extends Weapon {

    private int damage = 3;
    private String name = "Warhammer";
    private char charRepresentation = 'W';
    private Image imgRepresentation = new Image("warhammer.png");

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
