package cleancodeoopprinciples.model.human;

import cleancodeoopprinciples.UseWeapon;
import cleancodeoopprinciples.exception.WeaponException;
import cleancodeoopprinciples.model.weapon.Weapon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type of Warrior is an instance of Human Class
 * It is used to use weapons
 *
 * @author Mustafa Çalık
 */
public class Warrior extends Human implements UseWeapon {

    private final Logger logger = LoggerFactory.getLogger(Warrior.class);

    /*
        * WarriorHuman olan sınıf ismi Warrior olarak değiştirilmiştir. Her alt sınıfta Human kelimesinin sona eklenmesi gereksiz isim tekrarı olduğu için kaldırılmıştır.
        * printWeapon metodu kullanılmadığı için kaldırılmıştır.
        * interfaceden gelen useWeapon metodunda WeaponType a göre değişen kullanım şekli değiştirilmiştir. Weapon tipine göre farklılaşan işleyiş, Weapondan türeyen alt sınıfların içinde sağlanmıştır.
        * Her yeni weapon geldiğinde Warrior içine müdahale gereksinimi ortadan kalkmıştır. (SOLID - Open-Closed Principle) (OOP - Polymorphism)
        * craftWeapon metodu kaldırılmıştır; çünkü human tipinde sunulan bir metod olmadığı için içi boş bırakılmıştı.
     */
    private Weapon weapon;

    /**
     * Instantiates a new Warrior.
     *
     * @param name the name
     */
    public Warrior(String name) {
        super(name);
    }

    /**
     * Instantiates a new Warrior.
     *
     * @param humanName the human name
     * @param weapon    the weapon
     */
    public Warrior(String humanName, Weapon weapon) {
        super(humanName);
        this.weapon = weapon;
    }

    @Override
    public void useWeapon() {
        if(weapon == null){
            throw new WeaponException("There is no Weapon ready");
        }
        String useMessage = weapon.use();
        logger.info("{} by {}", useMessage, name);
    }

    /**
     * Gets weapon.
     *
     * @return the weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Sets weapon.
     *
     * @param weapon the weapon
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
