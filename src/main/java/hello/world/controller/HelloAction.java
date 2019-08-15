package hello.world.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import hello.world.entity.User;

import java.util.ArrayList;

public class HelloAction extends ActionSupport implements Preparable {

    private String username;
    private User user;
    private static ArrayList<User> listUser;

    public void prepare() throws Exception {
        System.out.println("Create list user");
        if (listUser == null) {
            listUser = new ArrayList<User>();
            listUser.add(User.Builder.anUser().withEmail("hung@gmail.com").withUsername("hungdx").withPassword("123").build());
            listUser.add(User.Builder.anUser().withEmail("tung@gmail.com").withUsername("tungnt").withPassword("321").build());
            listUser.add(User.Builder.anUser().withEmail("tungcsharp@gmail.com").withUsername("tungcsharp").withPassword("123").build());
            listUser.add(User.Builder.anUser().withEmail("tungfullstack@gmail.com").withUsername("tungfullstack").withPassword("567").build());
            listUser.add(User.Builder.anUser().withEmail("hoangkorea@gmail.com").withUsername("hoangkorea").withPassword("567").build());
        }
    }

    public String hello() {
        refreshUser();
        return "hello-form";
    }

    public String sayHello() {
        this.listUser.add(this.user);
        refreshUser();
        return "hello-form";
    }

    private void refreshUser() {
        this.user = new User();
    }

    @Override
    public void validate() {
        if (this.user == null) {
            return;
        }
        if (this.user.getUsername() == null || this.user.getUsername().trim().length() == 0) {
            addFieldError("user.username", "Username is required!");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        this.listUser = listUser;
    }


}
