package cleancodeoopprinciples.model.weapon;

/**
 * The type Sword.
 */
public class Sword extends Weapon {
    /**
     * Instantiates a new Sword.
     *
     * @param weaponName the weapon name
     */
    public Sword(String weaponName) {
        super(weaponName);
    }
    @Override
    public String use() {
        return name + " is used ";
    }
}
