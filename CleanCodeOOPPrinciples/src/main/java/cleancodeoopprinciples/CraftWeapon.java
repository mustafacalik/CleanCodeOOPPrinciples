package cleancodeoopprinciples;

import cleancodeoopprinciples.model.weapon.Weapon;
import cleancodeoopprinciples.enums.WeaponType;

/**
 * The interface Craft weapon.
 */
public interface CraftWeapon {

    /**
     * Craft weapon weapon.
     *
     * @param type the type
     * @return the weapon
     */
    /*
     * Tüm human tiplerinde sağlanan bir metod olmadığı için interface haline getirilmiştir.
     */
    Weapon craftWeapon(WeaponType type);
}
