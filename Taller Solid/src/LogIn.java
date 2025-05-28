public class LogIn implements ILogin {
    private IDatabase database;

    public LogIn(IDatabase database) {
        this.database = database;
    }

    @Override
    public boolean authenticate(User user) {
        // lógica de autenticación básica
        database.insertUser(user);
        return true;
    }
}
