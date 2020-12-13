/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import application.ContactApplication;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;
import domain.event.Contact;
import exceptions.BusinessException;
import java.util.List;
import web.annotations.Auth;

/**
 *
 * @author Lucas
 */
@Controller
@Path("events")
@Auth
public class EventController {

    @Inject
    private ContactApplication contactApplication;

    @Inject
    private Result result;

    @Get("create-event")
    public void createEvent() {
    }

    @Get("")
    public void getEvents() {
        result.include("eventsList", this.contactApplication.listAll());
    }

    @Post("save")
    @Auth
    public void persistEvent(Contact contact) {
        try {
            this.contactApplication.save(contact);
            result.redirectTo(UserController.class).userPage();
        } catch (BusinessException e) {
            result.include("event", contact);
            result.include("errorMessage", e.getMessage());
            result.redirectTo(this).createEvent();
        }
    }

    @Get("update/id/{id}")
    @Auth
    public void getEventToUpdate(String id) {
        result.include("event", this.contactApplication.getById(id));
    }

    @Post("update")
    @Auth
    public void updateEvent(Contact contact) {
        this.contactApplication.update(contact);
        result.redirectTo(UserController.class).userPage();
    }

    @Get("delete/id/{id}")
    @Auth
    public void getEventToDelete(String id) {
        result.include("event", this.contactApplication.getById(id));
    }

    @Post("delete")
    @Auth
    public void delete(Contact contact) {
        this.contactApplication.remove(contact);
        result.redirectTo(UserController.class).userPage();
    }

    @Get("bydate")
    @Auth
    public void eventsByDate(String date) {
        result.include("events", this.contactApplication.findByDate(date));
        result.include("date",date);
    }

}
