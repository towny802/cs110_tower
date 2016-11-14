
import java.util.ArrayList;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Ben Specniner
 */
public abstract class GamePiece extends Parent {

    public int[] pos = {0, 0};
    public String name;
    public ImageView view;
    private int health;
    private int damage;
    private int armor;

    public GamePiece() {
        view = new ImageView(getImgRepresentation());
        view.setX(pos[0] * (640 / 20));
        view.setY(pos[1] * (640 / 20));
        view.setFitHeight(32);
        view.setFitWidth(32);
    }

    public GamePiece(int[] pos) {
        this.pos[0] = pos[0];
        this.pos[1] = pos[1];
        view = new ImageView(getImgRepresentation());
        view.setX(pos[0] * (640 / 20));
        view.setY(pos[1] * (640 / 20));
        view.setFitHeight(32);
        view.setFitWidth(32);
    }

    public GamePiece(int[] pos, int health, int damage, int armor) {
        this.pos[0] = pos[0];
        this.pos[1] = pos[1];
        view = new ImageView(getImgRepresentation());
        view.setX(pos[0] * (640 / 20));
        view.setY(pos[1] * (640 / 20));
        view.setFitHeight(32);
        view.setFitWidth(32);
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    private void move(int[] dir) {
        this.pos[0] += dir[0];
        this.pos[1] += dir[1];
    }

    public void rePos(int[] move, ImageView view) {
        this.move(move);
        double pxx = this.pos[0] * 0.05 * 640;
        double pyy = this.pos[1] * 0.05 * 640;
        view.setX(pxx);
        view.setY(pyy);
    }

    /**
     * @param offense
     * @param defense
     * @return returns true if defender died, returns false if defender survived
     */
    public boolean attack(GamePiece offense, GamePiece defense) {
        defense.setHealth(defense.getHealth() - (offense.getDamage() - defense.getArmor()));
        System.out.println(offense.getName() + " dealt " + (offense.getDamage() - defense.getArmor()) + " damage to " + defense.getName() + ". It has " + defense.getHealth() + " health left.");
        if (defense.getHealth() <= 0) {
            System.out.println(defense.getName() + " died!");
        }
        return defense.getHealth() <= 0;
    }

    public Item dropItem(Creature creature) {
        int rand = (int) (Math.random() * 100);
        switch (creature.getType()) {
            case 0: //bandits
                if (rand <= 50) {
                    return new Dagger();
                } else {
                    return new Cloak();
                }
            default:
                return null;
        }
    }

    public int getX() {
        return pos[0];
    }

    public int getY() {
        return pos[1];
    }

    public abstract char getCharRepresentation();

    public abstract Image getImgRepresentation();

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the armor
     */
    public int getArmor() {
        return armor;
    }

    /**
     * @param armor the armor to set
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

}
