/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import domain.event.Contact;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class ContactDB {

    private List<Contact> eventList = new ArrayList<>();

    public ContactDB() {

    }

    public void save(Contact contact) {
        this.eventList.add(contact);
    }

    public Contact getById(String id) {

        Contact contact = null;
        for (Contact e : eventList) {
            if (e.getUuid().equals(id)) {
                contact = e;
            }
        }

        return contact;
    }

    public List<Contact> findByDate(String date) {
        List<Contact> eventsByDate = new ArrayList<>();
        for (Contact e : this.eventList) {
            if (e.getDate().equals(date)) {
                System.out.println("evento circulando: " + e.getDate());
                eventsByDate.add(e);
            }
        }
        return eventsByDate;
    }

    public void update(Contact contact) {
        int position = this.eventList.indexOf(contact);
        this.eventList.set(position, contact);

    }

    public void remove(Contact contact) {
        eventList.remove(contact);
    }

    public List<Contact> listAll() {
        return eventList;
    }
}
