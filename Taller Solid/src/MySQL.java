public class MySQL implements IDatabase {
    public void insertUser(User user) {
        System.out.println("Inserting user: " + user.getNickname());
    }
}
