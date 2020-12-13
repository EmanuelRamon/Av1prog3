/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import domain.user.User;
import domain.user.UserService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class UserApplication {

    @Inject
    private UserService userService;

    public void save(User user) {
        this.userService.save(user);
    }

    public void update(User user) {
        this.userService.update(user);
    }

    public User getByCPf(String cpf) {
        return this.userService.getUserByCpf(cpf);
    }

    public User getByEmail(String email) {
        return this.userService.getUserByEmail(email);
    }
    
    public void remove(User user){
        this.userService.remove(user);
    }
}
