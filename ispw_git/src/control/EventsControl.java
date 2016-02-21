package control;

import bean.EventsBean;
import entity.promozioni.Event;
import entity.promozioni.EventsList;
import persistency.LoadAndStoreObjectsOnFile;

/**
 * The Class EventsControl.
 */
public class EventsControl {

    private static EventsControl instance = null;

    /**
     * Gets the single instance of EventsControl.
     *
     * @return single instance of EventsControl
     */
    public static synchronized EventsControl getInstance() {
	if (EventsControl.instance == null) {
	    instance = new EventsControl();
	}
	return instance;
    }

    /**
     * Crea evento.
     *
     * @param eventsBean the events bean
     * @return true, if successful
     */
    public boolean creaEvento(EventsBean eventsBean) {

	// <<create>> Event

	Event event = new Event(eventsBean.getNome(), eventsBean.getDescrizione(), eventsBean.getCitta(),
		eventsBean.getLuogo(), eventsBean.getOrario(), eventsBean.getDate());
	EventsList eventsList = new EventsList();
	LoadAndStoreObjectsOnFile evListStream = new LoadAndStoreObjectsOnFile("./eventsList.txt");
	eventsList = (EventsList) evListStream.loadObject();

	// delete

	eventsList.addEvent(event);
	LoadAndStoreObjectsOnFile outStream = new LoadAndStoreObjectsOnFile("./promotionsList.txt");
	outStream.storeObject(eventsList);

	// oggetto Promotion serializzato su file promotionsList.txt che viene
	// aggiornato

	return true;
    }

    /**
     * Elimina evento.
     *
     * @param eventsBean the events bean
     * @return true, if successful
     */
    public boolean eliminaEvento(EventsBean eventsBean) {

	// <<create>> Event

	Event event = new Event(eventsBean.getNome(), eventsBean.getDescrizione(), eventsBean.getCitta(),
		eventsBean.getLuogo(), eventsBean.getOrario(), eventsBean.getDate());
	EventsList eventsList = new EventsList();
	LoadAndStoreObjectsOnFile evListStream = new LoadAndStoreObjectsOnFile("./eventsList.txt");
	eventsList = (EventsList) evListStream.loadObject();

	// delete

	eventsList.deleteEvent(event);
	LoadAndStoreObjectsOnFile outStream = new LoadAndStoreObjectsOnFile("./promotionsList.txt");
	outStream.storeObject(eventsList);

	// oggetto Promotion serializzato su file promotionsList.txt che viene
	// aggiornato

	return true;
    }
}
