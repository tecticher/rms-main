package rms.customer;

/**
 *
 */
public interface CustomerService {

    /**
     *
     * @param id
     * @param name
     * @param surName
     * @param address
     */
    public void addCustomer(String id, String name, String surName, String address);

    /**
     *
     * @param customerId
     * @return
     */
    public Customer search( String customerId );

}
