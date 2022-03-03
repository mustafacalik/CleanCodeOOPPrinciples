package cleancodeoopprinciples.model.weapon;

/**
 * The type Riffle.
 */
public class Riffle extends Weapon {
    /**
     * Instantiates a new Riffle.
     *
     * @param weaponName the weapon name
     */
    public Riffle(String weaponName) {
        super(weaponName);
    }

    @Override
    public String use() {
        return name + " is used ";
    }
}
