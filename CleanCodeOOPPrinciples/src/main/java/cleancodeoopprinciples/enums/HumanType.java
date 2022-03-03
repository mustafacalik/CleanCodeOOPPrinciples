package cleancodeoopprinciples.enums;

import cleancodeoopprinciples.model.human.Craftsman;
import cleancodeoopprinciples.model.human.Warrior;

/**
 * The enum Human type.
 */
public enum HumanType {
    /**
     * The Craftsman.
     */
    CRAFTSMAN {
        @Override
        public Craftsman createHuman() {
            return new Craftsman("Craftsman");
        }
    },
    /**
     * The Warrior.
     */
    WARRIOR {
        @Override
        public Warrior createHuman() {
            return new Warrior("Warrior");
        }
    };

    /**
     * Create human t.
     *
     * @param <T> the type parameter
     * @return the t
     */
    public abstract <T> T createHuman();
}
