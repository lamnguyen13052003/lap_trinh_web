package services;

import modal.User;

import java.util.HashMap;
import java.util.Map;

public class ServicesUser {
    public static ServicesUser instance = new ServicesUser();

    private static Map<String, User> user = new HashMap<String, User>();

    static {
        User u = new User();
        u.setUserName("admin@gmail.com");
        u.setPassword("admin");
        user.put("admin@gmail.com", u);
        u = new User();
        u.setUserName("lamnguyen@gmail.com");
        u.setPassword("123");
        user.put("lamnguyen@gmail.com", u);
    }

    public User getUser(String userName, String password) {
        User u = user.get(userName);
        if(u != null && u.equalsPass(password)){
            return u;
        }

        return null;
    }

    public void setUser(User u) {
        user.put(u.getUserName(), u);
        System.out.println(user);
    }
}
