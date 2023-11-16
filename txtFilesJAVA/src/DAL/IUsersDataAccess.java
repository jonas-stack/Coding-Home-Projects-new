package DAL;

import BE.Users;

import java.util.List;

public interface IUsersDataAccess {

    public List<Users> getAllUsers() throws Exception;

    public Users createUser(int pos, String fNAme, String lName) throws Exception;

    public void updateUser(Users users) throws Exception;

    public void deleteUSer(Users users) throws Exception;

}