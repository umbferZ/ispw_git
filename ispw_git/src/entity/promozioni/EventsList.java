package entity.promozioni;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class EventsList.
 */
public class EventsList {

    private List<Event> eventsList;

    /**
     * Instantiates a new events list.
     */
    public EventsList() {
	this.eventsList = new ArrayList<>();
    }

    /**
     * Adds the event.
     *
     * @param event
     *            the event
     */
    public void addEvent(Event event) {
	this.eventsList.add(event);
    }

    /**
     * Delete event.
     *
     * @param event
     *            the event
     */
    public void deleteEvent(Event event) {
	this.eventsList.remove(event);
    }

    /**
     * Gets the event by id.
     *
     * @return event by id
     */
    public void getEventById() {
	// TODO implement here
    }

    /**
     * Gets the events list.
     *
     * @return events list
     */
    public List<Event> getEventsList() {
	return eventsList;
    }

    /**
     * Sets the events list.
     *
     * @param eventsList
     *            the new events list
     */
    public void setEventsList(List<Event> eventsList) {
	this.eventsList = eventsList;
    }
}