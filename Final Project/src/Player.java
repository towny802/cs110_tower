
import javafx.scene.image.Image;

/**
 *
 * @author Ben Spenciner
 */
public class Player extends GamePiece {

    private char charRepresentation = 'X';
    private Image imgRepresentation = new Image("player.png");
    private int health;
    private int damage;
    private int armor;
    private String name = "Default";

    public Player(int[] pos) {
        super(pos);
    }

    public Player(int[] pos, int health, int damage, int armor) {
        super(pos, health, damage, armor);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
