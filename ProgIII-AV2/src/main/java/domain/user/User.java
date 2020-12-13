/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.user;

/**
 *
 * @author Lucas
 */
public class User {
   private String name;
   private String cpf;
   private String email;
   private String password;

    public User(String name, String cpf, String email, String password){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
    }
    
    public User(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        return ((User)obj).getCpf().equals(this.cpf); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
