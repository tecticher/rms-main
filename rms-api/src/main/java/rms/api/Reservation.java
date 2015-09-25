package rms.api;

/**
 *
 */
public class Reservation {

    private Bookable item;
    private Customer customer;
    private Schedule schedule;

    public Bookable getItem() {
        return item;
    }

    public void setItem(Bookable item) {
        this.item = item;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
