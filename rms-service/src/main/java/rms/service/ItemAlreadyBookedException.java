package rms.service;

/**
 *
 */
public class ItemAlreadyBookedException extends Exception {

    public ItemAlreadyBookedException() {
        super();
    }

    public ItemAlreadyBookedException( String err ) {
        super(err);
    }
}
