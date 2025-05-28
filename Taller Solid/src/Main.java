public class Main {
    public static void main(String[] args) {
        User user = new User("admin", "1234");

        IDatabase db = new MySQL();
        ILogin login = new LogInAdmin(db); // o LogIn
        ICloudProvider provider = new AWSProvider();

        AppWeb app = new AppWeb(login, db, provider);
        app.start(user);
    }
}
