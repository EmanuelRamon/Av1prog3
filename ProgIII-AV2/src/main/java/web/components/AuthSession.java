/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.components;

import domain.event.Contact;
import domain.user.User;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Lucas
 */
@SessionScoped
@Named("authSession")
public class AuthSession implements Serializable {
    
    private User user;
    private List<Contact> eventList;

    public List<Contact> getEventList() {
        return eventList;
    }

    public void setEventList(List<Contact> eventList) {
        this.eventList = eventList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
