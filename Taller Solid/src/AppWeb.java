public class AppWeb {
    private ILogin login;
    private IDatabase database;
    private ICloudProvider cloudProvider;

    public AppWeb(ILogin login, IDatabase database, ICloudProvider cloudProvider) {
        this.login = login;
        this.database = database;
        this.cloudProvider = cloudProvider;
    }

    public void start(User user) {
        if (login.authenticate(user)) {
            System.out.println("Access granted");
            cloudProvider.host(this);
        } else {
            System.out.println("Access denied");
        }
    }
};