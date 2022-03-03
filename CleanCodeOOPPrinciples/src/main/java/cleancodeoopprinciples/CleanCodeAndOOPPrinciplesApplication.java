package cleancodeoopprinciples;

import cleancodeoopprinciples.enums.HumanType;
import cleancodeoopprinciples.enums.WeaponType;
import cleancodeoopprinciples.model.human.Craftsman;
import cleancodeoopprinciples.model.human.Warrior;
import cleancodeoopprinciples.model.weapon.Weapon;

/**
 * The type Clean code and oop principles application.
 */
public class CleanCodeAndOOPPrinciplesApplication {

    /*
        * Human ve Weapon üretimi java enum içinde factory method pattern ile sağlanmıştır. Bu sayede obje yaratma işlemi generic olarak tek bir yerden yönetilmiştir.
     */

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){

        Craftsman craftsman = HumanType.CRAFTSMAN.createHuman();
        Weapon weapon = craftsman.craftWeapon(WeaponType.RIFFLE);

        Warrior warrior = HumanType.WARRIOR.createHuman();
        warrior.setWeapon(weapon);
        warrior.useWeapon();
    }

}
