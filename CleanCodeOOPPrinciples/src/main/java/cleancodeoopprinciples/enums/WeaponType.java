package cleancodeoopprinciples.enums;

import cleancodeoopprinciples.model.weapon.Knife;
import cleancodeoopprinciples.model.weapon.Riffle;
import cleancodeoopprinciples.model.weapon.Sword;
import cleancodeoopprinciples.model.weapon.Weapon;

/**
 * The enum Weapon type.
 */
public enum WeaponType {

    /*
        * Küçük harfle yazılan enum değerleri büyük harfle yazılacak şekilde değiştirildi.
     */


    /**
     * The Knife.
     */
    KNIFE {
        @Override
        public Weapon createWeapon() {
            return  new Knife("knife");
        }
    },
    /**
     * The Sword.
     */
    SWORD {
        @Override
        public Weapon createWeapon() {
            return new Sword("sword");
        }
    },
    /**
     * The Riffle.
     */
    RIFFLE {
        @Override
        public Weapon createWeapon() {
            return new Riffle("riffle");
        }
    };

    /**
     * Create weapon weapon.
     *
     * @return the weapon
     */
    public abstract Weapon createWeapon();

}
