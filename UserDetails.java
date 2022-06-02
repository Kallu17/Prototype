import java.util.ArrayList;
import java.util.List;
 
public class UserDetails implements Cloneable{
    private ArrayList userList;
     
    public UserDetails() {
        this.userList=new ArrayList<User>();
    }
     
    public UserDetails(ArrayList users) {
        this.userList = users;
    }
     
    public void getUsers() {
        UserService s = new UserService();
        this.userList = s.getUsers();
    }
     
    public ArrayList getUsersList(){
        return userList;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
            List temp = new ArrayList();
            
            this.getUsersList().forEach((s) -> temp.add(s));
            return new UserDetails((ArrayList) temp);
    }
