
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Quarterstaff extends Weapon {

    private int damage = 5;
    private String name = "Quarterstaff";
    private char charRepresentation = '!';
    private Image imgRepresentation = new Image("longsword.png");

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
