package entity.promozioni;

import java.util.*;

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
     * @param event the event
     */
    public void addEvent(Event event) {
	this.eventsList.add(event);
    }

    /**
     * Delete event.
     *
     * @param event the event
     */
    public void deleteEvent(Event event) {
	this.eventsList.remove(event);
    }

    /**
     * Gets the event by id.
     *
     * @return the event by id
     */
    public void getEventById() {
	// TODO implement here
    }

    /**
     * Gets the events list.
     *
     * @return the events list
     */
    public List<Event> getEventsList() {
	return eventsList;
    }

    /**
     * Sets the events list.
     *
     * @param eventsList the new events list
     */
    public void setEventsList(List<Event> eventsList) {
	this.eventsList = eventsList;
    }
}