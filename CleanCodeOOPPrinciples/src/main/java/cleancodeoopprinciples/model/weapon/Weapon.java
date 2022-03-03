package cleancodeoopprinciples.model.weapon;

/**
 * The type Weapon.
 */
public abstract class Weapon {

    /**
     * The Name.
     */
    /*
        * Weapon sınıf abstract yapılmış olup, knife, riffle ve sword türleri inheritance ile alt sınıf olarak türetilip yönetilmiştir. (OOP - Inheritance, Polymorphism)
        * weaponName propertysi protected yapılarak Encapsulation konsepti uygulanmıştır. (OOP - Encapsulation)
        * type propertysi kaldırılmıştır. Çünkü alt sınıflar oluşturulduğu için ayrıca type alanı tutmasına gerek kalmamıştır.
        * Her weapon tipine göre kullanım farklılaşacağı için abstract method olarak weapon alt sınıfına göre "use" metodu eklenmiştir.
     */
    protected String name;

    /**
     * Instantiates a new Weapon.
     *
     * @param name the name
     */
    protected Weapon(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Use string.
     *
     * @return the string
     */
    public abstract String use();
}
