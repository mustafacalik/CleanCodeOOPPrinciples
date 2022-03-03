package cleancodeoopprinciples.model.human;

/**
 * The type Human.
 */
public abstract class Human {

    /*
        * humanName propertysi name olarak değiştirilmiştir. Bu şekilde kendinden türeyen alt sınıflar da düşünüldüğünde daha okunaklı bir isimlendirme sağlanmıştır.
        * public olan name propertysi protected yapılmıştır. Bu şekilde Encapsulation konseptine uygun hale getirilmiştir.
        * Weapon propertysi tüm sınıflarda olması gerekmediği için kaldırılmıştır. (SOLID - Liskov Substitution Principle)
        * useWeapon ve craftWeapon abstract methodları da kaldırılarak interface yapılmıştır. Çünkü human tipine özel metodlardır ve her humanın bunları sağlaması beklenmemektedir.
     */

    /**
     * The Name.
     */
    protected String name;

    /**
     * Instantiates a new Human.
     *
     * @param name the name
     */
    protected Human(String name) {
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

}
