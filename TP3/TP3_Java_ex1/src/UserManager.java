import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private static UserManager instance;

    private List<User> users;


    private UserManager() {
        super();
        users = new ArrayList<User>();
    }


    public List<User> getUsers() {
        return users;
    }

    public static UserManager getUserManager(){
        if(UserManager.instance == null){
            UserManager.instance = new UserManager();
        }
        return UserManager.instance;
    }
    // TODO
    public User createUser(String nom) throws IllegalStateException{
      User user = new User(nom);
      Object[] us = users.stream().
              filter(u -> u.getNom().equals(user.getNom()))
              .toArray();
      if (us.length >0) throw new IllegalStateException();
      else users.add(user);
      return user;
    }

}
