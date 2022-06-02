import java.util.List;
 
public class ImplementorClass {
    public static void main(String[] args) {
        UserDetails users = new UserDetails();
        users.getUsers();

        UserDetails usersNew;
        try {
            usersNew = (UserDetails) users.clone();
            UserDetails usersNew1 = (UserDetails) users.clone();
            List list = usersNew.getUsersList();
            list.add(new User("Tim", "tim@gmail.com"));
            List list1 = usersNew1.getUsersList();
            list1.remove(new User("steve", "steve@gmail.com"));
 
            System.out.println("users List: \n" + users.getUsersList());
            System.out.println("usersNew List: \n" + list);
            System.out.println("usersNew1 List: \n" + list1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
