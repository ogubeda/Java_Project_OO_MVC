package Modules.Users.Classes;

public class Admin extends Users {
    //////
    public Admin (String username, String password, String email) {
        //////
        super(username, password, email);
    }// end_Generic_Constructor

    @Override
    public String toString() {
        return "Username: " + this.getUsername() + "\nPassword: " + this.getPassword() + "\nEmail: " + this.getEmail() + "\nRegister Date: " + this.getRegisterDate().dateToString();
    }
    
}// end_Generic
//////