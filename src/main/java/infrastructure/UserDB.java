/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import domain.user.User;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class UserDB {

    private List<User> userList = new ArrayList<>();

    public UserDB() {

    }

    public void save(User user) {
        this.userList.add(user);
    }

    public User getUserByCpf(String cpf) {

        User user = null;
        for (User u : userList) {
            if (u.getCpf().equals(cpf)) {
                user = u;
            }
        }
        return user;
    }

    public User getUserByEmail(String email) {

        User user = null;
        for (User u : userList) {
            if (u.getEmail().equals(email)) {
                user = u;
            }
        }
        return user;
    }

    public void update(User user) {
        int position = this.userList.indexOf(user);
        this.userList.set(position, user);
    }

    public void remove(User user) {
        this.userList.remove(user);
    }
}
