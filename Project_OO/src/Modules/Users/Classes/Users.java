package Modules.Users.Classes;

import Classes.Fecha;

public abstract class Users {
    //////
    private String username;
    private String password;
    private String email;
    private Fecha registerDate;
    //////
    public Users (String username, String password, String email) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.setRegisterDate();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Fecha getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate() {
        this.registerDate = this.registerDate.generateSysDate();
    }
}// end_Users