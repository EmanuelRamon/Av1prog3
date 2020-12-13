/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import domain.event.Event;
import domain.event.EventService;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class EventApplication {

    @Inject
    private EventService eventService;

    public void save(Event event) {
        this.eventService.save(event);
    }

    public void update(Event event) {
        this.eventService.update(event);
    }

    public List<Event> listAll() {
        return this.eventService.listAll();
    }

    public Event getById(String id) {
        return this.eventService.getById(id);

    }

    public  List<Event> findByDate(String id) {
        return this.eventService.findByDate(id);

    }

    public void remove(Event event) {
        this.eventService.remove(event);
    }

}
