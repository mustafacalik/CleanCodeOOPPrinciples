package cleancodeoopprinciples.exception;

/**
 * The type Weapon exception.
 */
public class WeaponException extends RuntimeException {
    /**
     * Instantiates a new Weapon exception.
     *
     * @param message   the message
     * @param exception the exception
     */
    public WeaponException(String message, Exception exception) {
        super(message, exception);
    }

    /**
     * Instantiates a new Weapon exception.
     *
     * @param message the message
     */
    public WeaponException(String message) {
        super(message);
    }
}
