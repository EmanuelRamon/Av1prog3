/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.event;

import exceptions.BusinessException;
import infrastructure.ContactDB;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class ContactService {

    @Inject
    private ContactDB contactDB;

    public void save(Contact contact) {
        if (contact.getTitle() == null
                || contact.getOwner() == null
                || contact.getPlace() == null
                || contact.getDate() == null) {
            throw new BusinessException("Campos não podem ser nulos X");
        }

        this.contactDB.save(contact);

    }

    public void update(Contact contact) {
        this.contactDB.update(contact);
    }

    public Contact getById(String id) {
        return this.contactDB.getById(id);
    }

    public List<Contact> findByDate(String date) {
        List<Contact> contacts = this.contactDB.findByDate(date);
        return contacts;
    }

    public List<Contact> listAll() {
        return this.contactDB.listAll();
    }

    public void remove(Contact contact) {
        this.contactDB.remove(contact);
    }
}
