/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.event;

import exceptions.BusinessException;
import infrastructure.EventDB;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class EventService {

    @Inject
    private EventDB eventDB;

    public void save(Event event) {
        if (event.getTitle() == null
                || event.getOwner() == null
                || event.getPlace() == null
                || event.getDate() == null) {
            throw new BusinessException("Campos não podem ser nulos X");
        }

        this.eventDB.save(event);

    }

    public void update(Event event) {
        this.eventDB.update(event);
    }

    public Event getById(String id) {
        return this.eventDB.getById(id);
    }

    public List<Event> findByDate(String date) {
        List<Event> events = this.eventDB.findByDate(date);
        return events;
    }

    public List<Event> listAll() {
        return this.eventDB.listAll();
    }

    public void remove(Event event) {
        this.eventDB.remove(event);
    }
}
