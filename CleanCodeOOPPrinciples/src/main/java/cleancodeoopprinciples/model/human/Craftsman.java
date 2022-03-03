package cleancodeoopprinciples.model.human;

import cleancodeoopprinciples.CraftWeapon;
import cleancodeoopprinciples.enums.WeaponType;
import cleancodeoopprinciples.model.weapon.Weapon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type of Craftsman is an instance of Human Class
 * It is used to craft Weapons
 *
 * @author Mustafa Çalık
 */
public class Craftsman extends Human implements CraftWeapon {

    private final Logger logger = LoggerFactory.getLogger(Craftsman.class);

    /**
     * Instantiates a new Craftsman.
     *
     * @param name the name
     */
    /*
        * CraftsmanHuman olan sınıf ismi Craftsman olarak değiştirilmiştir. Her alt sınıfta Human kelimesinin sona eklenmesi gereksiz isim tekrarı olduğu için kaldırılmıştır.
        * Human tipinden Weapon propertysi çıkarıldığı için constructor da bu alanın null olarak geçmesinin önüne geçilmiştir.
        * type propertysi kullanılmadığı için kaldırılmıştır.
        * craftWeapon metodu WeaponType üzerindeki factory method aracılığıyla objeleri üretip, dönecek şekilde değiştirilmiştir. Çünkü esas işi Weapon üretmek olduğu için bunu kendi içinde saklamayıp dışarıya dönmesi gerekmektedir.
     */
    public Craftsman(String name) {
        super(name);
    }

    @Override
    public Weapon craftWeapon(WeaponType type) {
        Weapon weapon = type.createWeapon();
        logger.info("{} is created by {}", weapon.getName(), getName());
        return weapon;
    }
}
