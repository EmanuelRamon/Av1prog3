/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import domain.event.Event;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class EventDB {

    private List<Event> eventList = new ArrayList<>();

    public EventDB() {

    }

    public void save(Event event) {
        this.eventList.add(event);
    }

    public Event getById(String id) {

        Event event = null;
        for (Event e : eventList) {
            if (e.getUuid().equals(id)) {
                event = e;
            }
        }

        return event;
    }

    public List<Event> findByDate(String date) {
        List<Event> eventsByDate = new ArrayList<>();
        for (Event e : this.eventList) {
            if (e.getDate().equals(date)) {
                System.out.println("evento circulando: " + e.getDate());
                eventsByDate.add(e);
            }
        }
        return eventsByDate;
    }

    public void update(Event event) {
        int position = this.eventList.indexOf(event);
        this.eventList.set(position, event);

    }

    public void remove(Event event) {
        eventList.remove(event);
    }

    public List<Event> listAll() {
        return eventList;
    }
}
