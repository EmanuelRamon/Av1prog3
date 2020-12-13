/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.user;

import exceptions.BusinessException;
import infrastructure.UserDB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class UserService {

    @Inject
    private UserDB userDB;

    public void save(User user) {
        User userCpf = this.userDB.getUserByCpf(user.getCpf());
        User userEmail = this.userDB.getUserByEmail(user.getEmail());
        if (userCpf != null || userEmail != null) {
            throw new BusinessException("CPF ou Email não está disponível para ser cadastrado.");
        }
        this.userDB.save(user);
    }

    public void update(User user) {
        this.userDB.update(user);
    }

    public User getUserByCpf(String cpf) {
        return this.userDB.getUserByCpf(cpf);
    }

    public User getUserByEmail(String email) {
        return this.userDB.getUserByEmail(email);
    }

    public void remove(User user) {
        User userToValidatePassword = this.getUserByCpf(user.getCpf());
        if (userToValidatePassword.getPassword().equals(user.getPassword())) {
            this.userDB.remove(user);
        } else {
            throw new BusinessException("Senha incorreta");
        }

    }
}
