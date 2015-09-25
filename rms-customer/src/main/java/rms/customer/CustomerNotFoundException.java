package rms.customer;

/**
 *
 */
public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException() {

    }

    public CustomerNotFoundException(String err) {
        super(err);
    }
}
