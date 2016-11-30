
/**
 *
 * @author Ben Spenciner
 */
public abstract class Creature extends GamePiece {

    public Creature(int[] pos, int health, int damage, int armor) {
        super(pos, health, damage, armor);
    }

    public Creature(int[] pos) {
        super(pos);
    }
}
