public class Main {

    public static void main(String[] args) {
        UserManager um1 = UserManager.getUserManager();
        UserManager um2 = UserManager.getUserManager();
//        UserManager um3 = new UserManager(); // not possible because we add a private class in our implementation of UserManager class
        System.out.println(um1.equals(um2));
        System.out.println(um1);
        System.out.println(um2);
        um1.createUser("ba");
        um1.createUser("be");
        um2.createUser("bc");
//        um1.createUser("ba");
        for (User u: um1.getUsers()) {
            System.out.println(u);
        }
        try {
            um2.createUser("ba");
        }catch(IllegalStateException e){
            e.printStackTrace();
        }
    }
}
