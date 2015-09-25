package rms.service;

import rms.api.Bookable;
import rms.api.Reservation;
import rms.api.Schedule;
import rms.customer.Customer;
import rms.customer.CustomerNotFoundException;

/**
 *
 */
public interface BookingService {

    /**
     * @param item
     * @param customer
     * @param schedule
     */
    public Reservation book(Bookable item, Customer customer, Schedule schedule)
            throws ItemAlreadyBookedException, CustomerNotFoundException;


    /**
     *
     * @param reservation
     * @throws ReservationNotFoundException
     */
    public void cancel(Reservation reservation) throws ReservationNotFoundException;
}
