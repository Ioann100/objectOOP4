import Task2.DataBaseUsers;
import Task2.User;
import Task1.Collection;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      //  Task1();
        Task2();

    }

    private static void Task1() {
        Collection collection1 = new Collection();
        Collection collection2 = new Collection();

        System.out.println(collection1.Length());
        System.out.println(collection1);
        collection1.Add(5);
        collection1.Add(6);
        collection1.Add(7);
        collection1.Add(8);
        collection1.Add(9);
        collection1.Add(10);
        collection1.Add(8);
        collection1.Add(10);
        collection1.Add(8);
        collection1.Add(18);

        System.out.println(collection1.Length());
        System.out.println(collection1);


        collection1.Add(1, 1);
        System.out.println(collection1);

        System.out.println(collection1.Remove(1));
        System.out.println(collection1);


        System.out.println(Arrays.toString(collection1.Part(3)));
        System.out.println(Arrays.toString(collection1.Part(3, 2)));

        System.out.println("First '8' is at position: " + collection1.FindFirst(8));
        System.out.println("Last '8' is at position: " + collection1.FindLast(8));

        collection2.Add(5);
        collection2.Add(6);
        collection2.Add(7);
        collection2.Add(8);
        collection2.Add(9);
        collection2.Add(10);
        collection2.Add(8);
        collection2.Add(10);
        collection2.Add(8);
        collection2.Add(1);

        boolean isEqual = collection1.equals(collection2.getElements());
        System.out.println(isEqual);
    }

    private static void Task2() {
        User user1 = new User("login1","pass1","name1");
        User user2 = new User("login2","pass2","name2");
        User user3 = new User("login3","pass3","name3");
        User user4 = new User("login4","pass4","name4");
        User use5r = new User("login5","pass5","name5");


        DataBaseUsers dataBaseUsers=new DataBaseUsers();

        dataBaseUsers.addUser(user1);
        dataBaseUsers.addUser(user2);
        dataBaseUsers.addUser(user3);
        System.out.println(dataBaseUsers);

        System.out.println( dataBaseUsers.removeUser(1));
        System.out.println(dataBaseUsers);
        System.out.println("=======");
        dataBaseUsers.infoUsers();
        System.out.println("=======");
        System.out.println( dataBaseUsers.findUser("login1"));
        System.out.println( dataBaseUsers.findUser("login456"));


        dataBaseUsers.clearBase();
        System.out.println(dataBaseUsers);
    }


}
