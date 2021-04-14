package Task2;

import java.util.Arrays;

public class DataBaseUsers implements IDataBase {

    private int lastID;
    private User[] users;
    private int size;

    public DataBaseUsers() {
        users = new User[size = lastID = 0];
    }


    @Override

    public void addUser(User user) {

        User[] temp = Arrays.copyOf(users, users.length + 1);
        temp[users.length] = user;
        users = temp;
        user.setUserID(++lastID);
        users[size++] = user;

    }

    @Override
    public User removeUser(int userID) {

        User user = null;

        if (userID > 0 && userID < users.length) {
            user = users[userID];

            for (int i = userID; i < users.length - 1; i++) {
                users[i] = users[i + 1];
            }
            users = Arrays.copyOf(users, users.length - 1);

        }

        return user;
    }

    @Override
    public void infoUsers() {

        System.out.println("All users info");
        for (int i = 0; i < users.length ; i++) {
            System.out.println( users[i].toString());

        }

    }

    @Override
    public User findUser(String login) {

        for (int i = 0; i <users.length ; i++) {

            if (login.equals(users[i].getLogin())){
                return users[i];

            }

        }
        return null;
    }

    @Override
    public void clearBase() {

        users = new User[0];


    }

    @Override
    public String toString() {
        return "DataBaseUsers {" +

                ", users= " + Arrays.toString(users) + '}';
    }
}
