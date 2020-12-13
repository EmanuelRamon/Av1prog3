/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import application.EventApplication;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;
import domain.event.Event;
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
    private EventApplication eventApplication;

    @Inject
    private Result result;

    @Get("create-event")
    public void createEvent() {
    }

    @Get("")
    public void getEvents() {
        result.include("eventsList", this.eventApplication.listAll());
    }

    @Post("save")
    @Auth
    public void persistEvent(Event event) {
        try {
            this.eventApplication.save(event);
            result.redirectTo(UserController.class).userPage();
        } catch (BusinessException e) {
            result.include("event", event);
            result.include("errorMessage", e.getMessage());
            result.redirectTo(this).createEvent();
        }
    }

    @Get("update/id/{id}")
    @Auth
    public void getEventToUpdate(String id) {
        result.include("event", this.eventApplication.getById(id));
    }

    @Post("update")
    @Auth
    public void updateEvent(Event event) {
        this.eventApplication.update(event);
        result.redirectTo(UserController.class).userPage();
    }

    @Get("delete/id/{id}")
    @Auth
    public void getEventToDelete(String id) {
        result.include("event", this.eventApplication.getById(id));
    }

    @Post("delete")
    @Auth
    public void delete(Event event) {
        this.eventApplication.remove(event);
        result.redirectTo(UserController.class).userPage();
    }

    @Get("bydate")
    @Auth
    public void eventsByDate(String date) {
        result.include("events", this.eventApplication.findByDate(date));
        result.include("date",date);
    }

}
