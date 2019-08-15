package hello.world.controller;

import com.opensymphony.xwork2.ActionSupport;
import hello.world.entity.User;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class UserAction extends ActionSupport {

    private User currentUser; // bean java

    public String register() {
        currentUser = new User();
        return INPUT;
    }

    public String store() {
        if (hasErrors()) {
            return INPUT;
        }
        ofy().save().entity(currentUser).now();
        return SUCCESS;
    }



    @Override
    public void validate() {
        if (currentUser == null || currentUser.getUsername().length() == 0) {
            addFieldError("currentUser.username", "First name is required.");
        }
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
