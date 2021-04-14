package Task2;

public interface IDataBase {

    void addUser(User user);

    User removeUser(int userID);

    void infoUsers();

    User findUser(String login);

    void clearBase();
}
