/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import domain.event.Contact;
import domain.user.User;
import infrastructure.ContactDB;
import infrastructure.UserDB;
import java.util.List;
import javax.inject.Inject;
import web.components.AuthSession;

/**
 *
 * @author Lucas
 */
@Controller
public class AuthController {

    @Inject
    private UserDB userDB;
    
    @Inject 
    private ContactDB contactDB;

    @Inject
    private Result result;

    @Inject
    private AuthSession authSession;

    @Get("login")
    public void login() {
    }
    
    @Get("logout")
    public void logout(){
        this.authSession = null;
        result.redirectTo(this).login();
    }

    @Post("auth")
    public void auth(User user) {
        User userFromDB = this.userDB.getUserByEmail(user.getEmail());
        List<Contact> contacts = this.contactDB.listAll();
        if (userFromDB != null) {
            if (userFromDB.getPassword().equals(user.getPassword())) {
                this.authSession.setUser(userFromDB);
                this.authSession.setEventList(contacts);
                result.redirectTo(UserController.class).userPage();
            } else {
                result.include("errorMessage", "Email ou senha inválidos");
                result.include("alertIcon","<img style=\"width:50px; height:50px\" src=\"/Eventos-App/images/alert-icon.png\">");

                result.include("user", user);
                result.redirectTo(this).login();
            }
        } else {
            result.include("errorMessage", "Email não cadastrado");
            result.include("alertIcon","<img style=\"width:50px; height:50px\" src=\"/Eventos-App/images/alert-icon.png\">");
            result.include("linkMessage", "Crie uma conta :)");
            result.include("link", "/Eventos-App/user/new");
            result.redirectTo(this).login();
        }
    }
}
