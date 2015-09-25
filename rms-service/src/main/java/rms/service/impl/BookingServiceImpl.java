package rms.service.impl;

import rms.api.Bookable;
import rms.api.Reservation;
import rms.api.Schedule;
import rms.customer.Customer;
import rms.customer.CustomerNotFoundException;
import rms.service.BookingService;
import rms.service.ItemAlreadyBookedException;
import rms.service.ReservationNotFoundException;

/**
 *
 */
public class BookingServiceImpl implements BookingService {

    /**
     *
     * @param item
     * @param customer
     * @param schedule
     * @return
     * @throws ItemAlreadyBookedException
     * @throws CustomerNotFoundException
     */
    public Reservation book(Bookable item, Customer customer, Schedule schedule) throws ItemAlreadyBookedException, CustomerNotFoundException {

        Reservation reservation = new Reservation();

        reservation.setItem(item);
        reservation.setSchedule(schedule);

        return reservation;
    }

    /**
     *
     * @param reservation
     * @throws ReservationNotFoundException
     */
    public void cancel(Reservation reservation) throws ReservationNotFoundException {



    }
}
