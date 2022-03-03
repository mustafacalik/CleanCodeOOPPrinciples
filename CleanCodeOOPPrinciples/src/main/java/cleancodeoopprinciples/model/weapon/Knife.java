package cleancodeoopprinciples.model.weapon;

/**
 * The type Knife.
 */
public class Knife extends Weapon {

    /**
     * Instantiates a new Knife.
     *
     * @param weaponName the weapon name
     */
    public Knife(String weaponName) {
        super(weaponName);
    }

    @Override
    public String use() {
        return name + " is used ";
    }
}
